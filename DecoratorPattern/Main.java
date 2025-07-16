package DecoratorPattern;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new PlainCoffee();
        Coffee afterAddOns = new CreamDecorator(new MilkDecorator(coffee));
        System.out.println("cost after add on -"+afterAddOns.cost());
        afterAddOns.printInfo();
    }

}
