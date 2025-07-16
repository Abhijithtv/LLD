package VisitorPattern;

public class DiscountVisitor implements IVisitor{

    @Override
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
