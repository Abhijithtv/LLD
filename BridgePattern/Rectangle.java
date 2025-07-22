package BridgePattern;

public class Rectangle extends Shape{
    int l;
    int b;

    public Rectangle(int l, int b, Drawer drawer) {
        super(drawer);
        this.l = l;
        this.b = b;
    }

    @Override
    void draw() {
        this.drawer.draw(this);
    }
}
