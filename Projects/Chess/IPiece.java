package Projects.Chess;

import java.util.List;

public interface IPiece {
    int getValue();
    String getName();
    PieceColor getPieceColor();
    List<int[]> getMoves(int cur_i, int cur_j, BoardGame boardGame);
}
