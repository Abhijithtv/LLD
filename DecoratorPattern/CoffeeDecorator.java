package DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee{
    public final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost(){
        return coffee.cost();
    }

    @Override
    public  void printInfo(){
        coffee.printInfo();
    }
}
