package Projects.TicTacToe;

public class ValidStrategy {
    private Board board;

    public ValidStrategy(Board board){
        this.board = board;
    }

    public boolean isValid(int i, int j, char symbol){
        return i>=0 && j>=0
                && i<board.getSize() && j<board.getSize()
                && board.getValue(i, j)=='\u0000';
    }
}
