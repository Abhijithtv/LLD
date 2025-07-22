package BridgePattern;

public abstract class Shape {
    Drawer drawer;

    public Shape(Drawer drawer){
        this.drawer = drawer;
    }

    abstract void draw();
}
