package BuilderPattern.Interfaces;

import BuilderPattern.Computer;

public interface IComputerBuilder {
    IComputerBuilder setSize(int size);

    IComputerBuilder setRam(int ram);

    IComputerBuilder setProcessor(String processor);

    Computer built();
}
