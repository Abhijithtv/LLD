package Projects.Chess;

import java.util.ArrayList;
import java.util.List;

public class King implements IPiece{
    @Override
    public int getValue() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getName() {
        return "KING";
    }

    @Override
    public List<int[]> getMoves(int cur_i, int cur_j, int boardSize) {
        List<int[]> moves = new ArrayList<>();

    }
}
