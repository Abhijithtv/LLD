package BridgePattern;

public class PixelDrawer implements Drawer{

    @Override
    public void draw(Triangle triangle) {
        double area = 0.5 * triangle.h * triangle.b;
        System.out.println("Pixel of Triangle -" + area);
    }

    @Override
    public void draw(Rectangle rectangle) {
        double area = rectangle.l * rectangle.b;
        System.out.println("Pixel of rectangle -" + area);
    }
}
