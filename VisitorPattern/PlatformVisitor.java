package VisitorPattern;

public class PlatformVisitor implements IVisitor{

    public void visit(ElectronicItem item) {
        int p = item.getPrice();
        item.applyDiscount(p/10);
    }

    @Override
    public void visit(FashionItem item) {
        int p = item.getPrice();
        item.applyDiscount(p/20);
    }
}
