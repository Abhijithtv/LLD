package Projects.TicTacToe;

import java.util.Scanner;

public class Player implements IPlayer {
    public char symbol;
    private Board board;

    public Player(char symbol){
        this.symbol = symbol;
    }

    @Override
    public int[] nextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Move for-"+symbol);
        int i = sc.nextInt();
        int j = sc.nextInt();
        return new int[]{i, j};
    }

    @Override
    public void update() {
        //updated state
    }

    @Override
    public char getSympol() {
        return symbol;
    }
}
