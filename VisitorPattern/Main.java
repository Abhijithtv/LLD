package VisitorPattern;

public class Main {
    public static void main(String[] args){
        ICartItem item = new ElectronicItem();
        item.print();
        item.accept(new DiscountVisitor());
        item.print();
        item.accept(new PlatformVisitor());
        item.print();
    }
}
