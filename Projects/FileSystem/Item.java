package Projects.FileSystem;

import java.util.List;

public interface Item {
    Item getParent();
    void setParent(Item item);
    String getName();
    void getInfo();
    Item move(String path);
    void add(Item item);
    void remove(String item);
    void listAll();
}
