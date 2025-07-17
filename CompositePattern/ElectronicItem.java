package CompositePattern;

public class ElectronicItem implements IItem{
    @Override
    public void open() {
        System.out.println("Its an electronic Item");
    }
}
