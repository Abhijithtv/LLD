package MomentoPattern;

public class Main {
    public static void main(String[] args){
        SnapShotManager manager = new SnapShotManager();
        Database database = new Database();
        database.addData("add one row");
        manager.store(database.getSnapShot());
        database.addData("add second row");
        manager.store(database.getSnapShot());
        database.addData("add third row");
        System.out.println(database.getData());
        database.setState(manager.undo());
        System.out.println(database.getData());
        database.setState(manager.undo());
        System.out.println(database.getData());
    }
}
