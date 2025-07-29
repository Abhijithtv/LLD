package Projects.TicTacToe;

public class PlayerFactory {
    public static IPlayer getInstance(char symbol){
        return new Player(symbol);
    }
}
