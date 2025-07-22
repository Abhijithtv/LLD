package BridgePattern;

public class VectorDrawer implements Drawer {
    @Override
    public void draw(Triangle triangle) {
        double area = 0.5 * triangle.h * triangle.b;
        System.out.println("Vector of Triangle -" + area);
    }

    @Override
    public void draw(Rectangle rectangle) {
        double area = rectangle.l * rectangle.b;
        System.out.println("Vector of rectangle -" + area);
    }
}
