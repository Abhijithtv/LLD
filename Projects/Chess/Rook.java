package Projects.Chess;

import java.util.ArrayList;
import java.util.List;

public class Rook implements IPiece{


    @Override
    public int getValue() {
        return 5;
    }

    @Override
    public String getName() {
        return "Rook";
    }

    @Override
    public List<int[]> getMoves(int cur_i, int cur_j, int boardSize) {
        List<int[]> moves = new ArrayList<>();

        //row
        for(int i=0; i<boardSize; i++){
            if(i==cur_i) continue;
            moves.add(new int[]{i, cur_j});
        }

        for(int j=0; j<boardSize; j++){
            if(j==cur_j) continue;
            moves.add(new int[]{cur_i, j});
        }
        return moves;
    }
}
