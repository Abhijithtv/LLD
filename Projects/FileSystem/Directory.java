package Projects.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Item{
    private Item parent;
    private String name;
    private List<Item> items;

    public Directory(String name ,Item parent){
        this.parent = parent;
        this.name = name;
        items = new ArrayList<>();
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
        System.out.println("Directory-"+name);
    }

    @Override
    public Item move(String path) {
        return items.stream().filter(x->x.getName().equals(path)).findAny().orElse(null);
    }

    @Override
    public void add(Item item) {
        item.setParent(this);
        items.add(item);
    }

    @Override
    public void remove(String item) {
        var res = move(item);
        if(res!=null){
            this.items.remove(res);
        }
    }

    @Override
    public void listAll() {
        for (Item item: items){
            System.out.println(item.getName());
        }
    }
}
