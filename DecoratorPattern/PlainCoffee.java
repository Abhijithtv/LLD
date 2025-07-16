package DecoratorPattern;

public class PlainCoffee implements Coffee {
    int coffeePowderCost = 5;

    @Override
    public int cost() {
        return coffeePowderCost;
    }

    @Override
    public void printInfo() {
        System.out.println("water");
        System.out.println("CoffeePowder");
    }
}
