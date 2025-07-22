package BridgePattern;

public class Triangle extends Shape{
    int h;
    int b;

    public Triangle(int h, int b, Drawer drawer) {
        super(drawer);
        this.h = h;
        this.b = b;
    }

    @Override
    void draw() {
        drawer.draw(this);
    }
}
