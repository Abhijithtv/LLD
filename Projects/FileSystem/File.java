package Projects.FileSystem;

public class File implements Item{
    private Item parent;
    private String name;

    public File(String name, Item parent){
        this.name = name;
        this.parent = parent;
    }

    @Override
    public Item getParent() {
        return parent;
    }

    @Override
    public void setParent(Item item) {
        this.parent = item;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getInfo() {
        String path = name;
        Item par = parent;
        while(par!=null){
            path = par.getName() + "/" + path;
            par = par.getParent();
        }
        System.out.println("Path = "+path);
    }

    @Override
    public Item move(String path) {
        System.out.println("Error: this is not a directory");
        return this;
    }

    @Override
    public void add(Item item) {
        System.out.println("Error: this is not a directory");
    }

    @Override
    public void remove(String item) {
        System.out.println("Error: this is not a directory");
    }

    @Override
    public void listAll() {
        System.out.println("Error: this is not a directory");
    }
}
