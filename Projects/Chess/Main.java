package Projects.Chess;

public class Main {

    public static void main(String[] args){
        BoardGame boardGame = new ChessBoard(new DefaultLayout());
        boardGame.initialize();
        boardGame.start();
    }
}
