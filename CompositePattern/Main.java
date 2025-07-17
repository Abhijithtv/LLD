package CompositePattern;

public class Main {
    public static void main(String[] args){
        IItem item1 = new FashionItem();
        IItem item2 = new FashionItem();
        IItem item3 = new ElectronicItem();
        IItem item4 = new ElectronicItem();
        Package pack1 = new Package();
        pack1.add(item1);

        Package pack2 = new Package();
        pack2.add(item2);

        Package pack3 = new Package();
        pack3.add(item3);

        Package pack4 = new Package();
        pack4.add(pack1);
        pack4.add(pack2);
        pack4.add(item4);
        pack4.open();
    }
}
