package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Package implements IItem{
    private List<IItem> items;

    public Package(){
        items = new ArrayList<>();
    }

    public void add(IItem item){
        this.items.add(item);
    }

    @Override
    public void open() {
        System.out.println("I am a package and going open items inside me");
        for(IItem item : items){
            item.open();
        }
    }
}
