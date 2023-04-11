package ss7_abstraction.ex.colorable;

public class TestShape {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Square(5.0);
        shape[1] = new Rectangle(4.0, 6.0);
        shape[2] = new Circle(1.0);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
            if (shape[i] instanceof IColorable) {
                ((IColorable) shape[i]).howToColor();
            }
        }
    }
}