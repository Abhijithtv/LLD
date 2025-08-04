package Projects.FileSystem;

public class Main {
    public static void main(String[] args){
        FileManager fileManager = new FileManager(new FileActionHandler());
        fileManager.start();
    }
}
