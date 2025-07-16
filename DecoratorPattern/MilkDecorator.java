package DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator {
    int milkCost = 3;

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost() {
        return milkCost + coffee.cost();
    }

    @Override
    public void printInfo() {
        coffee.printInfo();
        System.out.println("150ml of milk");
    }
}
