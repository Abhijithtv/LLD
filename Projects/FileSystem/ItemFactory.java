package Projects.FileSystem;

public class ItemFactory {

    public static Item getItem(String type, String name, Item parent){
        Item item = null;
        if(type.equals("Dir")){
            item = new Directory(name, parent);
        }
        else if(type.equals("File")){
            item = new File(name, parent);
        }
        return item;
    }
}
