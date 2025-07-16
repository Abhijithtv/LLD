package VisitorPattern;

public interface IVisitor {
    void visit(ElectronicItem item);
    void visit(FashionItem item);
}
