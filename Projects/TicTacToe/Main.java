package Projects.TicTacToe;

public class Main {
    public static void main(String[] args){
        BoardGame game = new TicTacToe();
        game.initialize();
        game.start();
    }
}
