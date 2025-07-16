package DecoratorPattern;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return 20 + coffee.cost();
    }


    public  void printInfo(){
        coffee.printInfo();
        System.out.println("cream");
    }


}
