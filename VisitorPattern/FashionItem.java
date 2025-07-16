package VisitorPattern;

public class FashionItem implements ICartItem {
    int price = 1000;

    @Override
    public void applyDiscount(int amt) {
        price -= amt;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        System.out.println("cur price = " + getPrice());
    }
}
