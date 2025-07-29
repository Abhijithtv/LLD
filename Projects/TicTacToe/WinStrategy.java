package Projects.TicTacToe;

public class WinStrategy {
    private Board board;

    public WinStrategy(Board board){
        this.board = board;
    }

    public boolean isWon(char symbol){
        for(int i=0; i<board.getSize(); i++){
            if(isGoodRow(i, symbol) || isGoodCol(i, symbol)) return true;
        }

        return isGoodDiagonal(symbol) || isGoodAntiDiagonal(symbol);
    }

    private boolean isGoodAntiDiagonal(char symbol) {
        for (int i=0; i<board.getSize(); i++){
            if(board.getValue(i, board.getSize()-1-i)!=symbol){
                return false;
            }
        }
        return true;
    }

    private boolean isGoodDiagonal(char symbol) {
        for(int i=0; i<board.getSize(); i++){
            if(board.getValue(i, i)!=symbol) return false;
        }
        return true;
    }

    private boolean isGoodRow(int i, char symbol) {
        for(int j=0; j<board.getSize(); j++){
            if(board.getValue(i, j)!=symbol) return false;
        }
        return true;
    }

    private boolean isGoodCol(int j, char symbol) {
        for(int i=0; i<board.getSize(); i++){
            if(board.getValue(i, j)!=symbol) return false;
        }
        return true;
    }
}
