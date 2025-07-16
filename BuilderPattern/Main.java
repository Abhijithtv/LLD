package BuilderPattern;

import BuilderPattern.Interfaces.IComputerBuilder;

public class Main {
    public static void main(String[] args){
        IComputerBuilder builder = new BasicComputerBuilder();
        builder.setRam(4).setProcessor("intel").setSize(400).built().printSpec();
    }

}
