package Projects.Chess;

import java.util.List;
import java.util.Scanner;

public class ChessBoard implements BoardGame{
    private  IPiece[][] state;
    private  Layout layout;
    private GameStatusStrategy gameStatusStrategy;
    private ValidPieceStrategy validPieceStrategy;
    private MoveTypeStrategy moveTypeStrategy;
    private IPlayer player1;
    private IPlayer player2;

    public  ChessBoard(Layout layout, GameStatusStrategy gameStatusStrategy){
        this.layout = layout;
    }

    @Override
    public void initialize() {
        state = new IPiece[8][8];
        player1.setPieceColor(PieceColor.White);
        player2.setPieceColor(PieceColor.Black);
        layout.makeArrangement(this);
    }

    @Override
    public void start() {
        int curPlayerIndex = 0;
        boolean isOver = false;
        Scanner sc = new Scanner(System.in);

        while (!isOver){
            IPlayer curPLayer = curPlayerIndex==0 ? player1 : player2;

            System.out.println("Select your piece for "+ curPLayer.getPieceColor());

            int pos_i = sc.nextInt();
            int pos_j = sc.nextInt();

            if(!validPieceStrategy.isValidPieceChoosen(pos_i, pos_j, this, curPLayer)){
                System.out.println("Invalid Piece..Retry");
                continue;
            }

            IPiece piece = state[pos_i][pos_j];

            List<int[]> moves = piece.getMoves(pos_i, pos_j, this);

            if(moves.size()==0){
                System.out.println("Cant move the select piece");
                continue;
            }

            System.out.println("Enter next pos for select piece");

            int next_i = sc.nextInt();
            int next_j = sc.nextInt();

            if(moves.stream().noneMatch(move -> move[0] == next_i && move[1] == next_j)){
                System.out.println("Cant move the select to position i="+next_i+" j=next_j");
                continue;
            }

            if(moveTypeStrategy.getMoveType(this, next_i, next_j, piece)==MoveType.Illegal){
                System.out.println("Its a illegal move");
                continue;
            }

            state[next_i][next_j] = piece;
            state[pos_i][pos_j] = null;

            GameStatus gameStatus = gameStatusStrategy.GetGameStatus(this);

            if(gameStatus==GameStatus.Draw){
                System.out.println("Game is draw");
                isOver = true;
            }
            else if(gameStatus==GameStatus.Won){
                System.out.println("Player with color -"+curPLayer.getPieceColor()+" won");
                isOver = true;
            }
            else{
                curPlayerIndex = curPlayerIndex ^ 1;
            }
        }

    }
}
