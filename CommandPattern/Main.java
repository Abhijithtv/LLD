package CommandPattern;

public class Main {
    public static void main(String[] args){
        Remote remote = new Remote();
        ICommand command = new OnCommand(remote);
        command.execute();
    }
}
