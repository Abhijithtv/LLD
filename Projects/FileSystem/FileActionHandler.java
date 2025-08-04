package Projects.FileSystem;

import java.util.Scanner;

public class FileActionHandler {
    public void makeDirectory(FileManager fileManager){
        System.out.println("Enter dir name");
        var name = new Scanner(System.in).next();
        fileManager.getCurItem().add(ItemFactory.getItem("Dir", name, fileManager.getCurItem()));
    }

    public void makeDirectory(FileManager fileManager, String name){
        fileManager.getCurItem().add(ItemFactory.getItem("Dir", name, fileManager.getCurItem()));
    }

    public void makeDirectory(FileManager fileManager, String[] names){
        Item cur = fileManager.getCurItem();
        for(String name: names){
            Item item = ItemFactory.getItem("Dir", name, cur);
            cur.add(item);
            cur = item;
        }
    }

    public Item changeDirectory(FileManager fileManager){
        System.out.println("Enter dir name");
        var str = new Scanner(System.in).next();
        String[] paths = str.split("/");
        Item cur = fileManager.getCurItem();
        for(String path: paths ){
            Item next = cur.move(path);
            if(next==cur){
                //failed to change-so invalid
                return fileManager.getCurItem();
            }
            cur = next;
        }

        return cur;
    }

    public void createFile(FileManager fileManager){
        System.out.println("Enter file name");
        var name = new Scanner(System.in).next();
        Item item = ItemFactory.getItem("File", name, fileManager.getCurItem());
        fileManager.getCurItem().add(item);
    }

    public void deleteFile(FileManager fileManager){
        System.out.println("Enter delete name");
        var name = new Scanner(System.in).next();
        fileManager.getCurItem().remove(name);
    }

    public void getInfo(FileManager fileManager) {
        fileManager.getCurItem().getInfo();
    }

    public void listAll(FileManager fileManager) {
        fileManager.getCurItem().listAll();
    }
}
