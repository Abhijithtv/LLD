package BuilderPattern;

import BuilderPattern.Interfaces.IComputerBuilder;

public class BasicComputerBuilder implements IComputerBuilder {
    Computer computer;

    public BasicComputerBuilder(){
        computer = new Computer();
    }

    @Override
    public IComputerBuilder setSize(int size) {
        computer.size = size;
        return this;
    }

    @Override
    public IComputerBuilder setRam(int ram) {
        computer.ram = ram;
        return this;
    }

    @Override
    public IComputerBuilder setProcessor(String processor) {
        computer.processor = processor;
        return this;
    }

    public Computer built(){
        return computer;
    }
}
