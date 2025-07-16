package VisitorPattern;

public interface ICartItem {
    void applyDiscount(int amt);
    int getPrice();
    void accept(IVisitor visitor);
    void print();
}
