package Projects.TicTacToe;

public class TicTacToe implements BoardGame {
    private int movesAvailable;
    private ValidStrategy validStrategy;
    private WinStrategy winStrategy;
    int playerCount;
    Board board;
    @Override
    public void initialize() {
        board = new Board(3);
        playerCount = 2;
        board.join(PlayerFactory.getInstance('X'));
        board.join(PlayerFactory.getInstance('O'));
        movesAvailable = board.getSize()*board.getSize();
        validStrategy = new ValidStrategy(board);
        winStrategy = new WinStrategy(board);
        System.out.println("Board initialization is complete");
    }

    @Override
    public void start() {
        int curPlayer = 0;
        while (!isDraw()){
            board.display();

            IPlayer player =  board.getPlayer(curPlayer);
            int[] moves = player.nextMove();

            if(!validStrategy.isValid(moves[0], moves[1], player.getSympol())){
                System.out.println("Invalid move, Try again");
                continue;
            }

            board.move(moves[0], moves[1], player.getSympol());

            if(winStrategy.isWon(player.getSympol())){
                System.out.println("Congarts....Player with "+ player.getSympol()+" won.");
                return;
            }

            movesAvailable--;
            curPlayer = (curPlayer+1) % playerCount;
        }
        System.out.println("<<<<<<<<Its is DRAW>>>>>>>>");
    }

    private boolean isDraw() {
        return movesAvailable==0;
    }

}
