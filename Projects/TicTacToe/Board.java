package Projects.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<IPlayer> players;
    private final char[][] state;

    public Board(int size){
        state = new char[size][size];
        players = new ArrayList<>();
    }

    public void join(IPlayer player){
        this.players.add(player);
    }

    private void notifyAllPlayers(){
        for(IPlayer player: players){
            player.update();
        }
    }


    public void move(int i, int j, char symbol){
        state[i][j] = symbol;
        notifyAllPlayers();
    }

    public char getValue(int i, int j){
        return state[i][j];
    }

    public int getSize(){
        return state.length;
    }

    public IPlayer getPlayer(int i){
        return players.get(i);
    }

    public void display(){
        for(int i=0; i<state.length; i++){
            for(int j=0; j<state[0].length; j++){
                if(j!=0){
                    System.out.print(" | ");
                }
                System.out.print(getValue(i,j));
            }
            System.out.println();
        }
    }
}
