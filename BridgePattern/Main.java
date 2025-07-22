package BridgePattern;

public class Main {
    public static void main(String[] args){
        Drawer pixelDrawer = new PixelDrawer();
        Drawer vectorDrawer = new VectorDrawer();
        Shape rect1 = new Rectangle(5, 11, pixelDrawer);
        Shape triangle1 = new Triangle(5, 10, pixelDrawer);
        rect1.draw();
        triangle1.draw();
        Shape rect2 = new Rectangle(5, 10, vectorDrawer);
        Shape triangle2 = new Triangle(5, 6, vectorDrawer);
        rect2.draw();
        triangle2.draw();
    }

}
