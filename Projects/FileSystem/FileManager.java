package Projects.FileSystem;

import java.util.Scanner;

public class FileManager {
    private Item root;
    private Item cur;
    private FileActionHandler fileActionHandler;

    public FileManager(FileActionHandler fileActionHandler){
        root = ItemFactory.getItem("Dir", "root", null);
        cur = root;
        this.fileActionHandler = fileActionHandler;
    }


    public void start(){
        initMainDir();
        Scanner sc = new Scanner(System.in);
        System.out.println("Started");
        boolean nextAction = true;
        while (nextAction){
            System.out.println("Enter action");
            String action = sc.next();
            if(action.equals("create")){
                fileActionHandler.createFile(this);
            }
            else if(action.equals("delete")){
                fileActionHandler.deleteFile(this);
            }
            else if(action.equals("cd")){
                cur = fileActionHandler.changeDirectory(this);
            }
            else if(action.equals("mkdir")){
                fileActionHandler.makeDirectory(this);
            }
            else if(action.equals("getInfo")){
                fileActionHandler.getInfo(this);
            }
            else if(action.equals("ls")){
                fileActionHandler.listAll(this);
            }

            System.out.println("next action? (true/false)");
            nextAction = sc.nextBoolean();
        }
    }

    private void initMainDir() {
        fileActionHandler.makeDirectory(this, "myPC");
        fileActionHandler.makeDirectory(this, "files");
        fileActionHandler.makeDirectory(this, "programFiles");
        fileActionHandler.makeDirectory(this, "");
        fileActionHandler.makeDirectory(this, "myPC");
        fileActionHandler.makeDirectory(this, new String[]{"a", "b", "c"});
    }

    public Item getCurItem(){
        return cur;
    }
}
