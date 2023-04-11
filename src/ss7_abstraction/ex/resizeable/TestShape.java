package ss7_abstraction.ex.resizeable;

public class TestShape {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(2.0);
        shape[1] = new Rectangle(4.0, 6.0);
        shape[2] = new Square(5.0);
        System.out.println("Trước khi resize");
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
        System.out.println("Sau khi resize");
        for (int i = 0; i < shape.length; i++) {
            shape[i].resize(Math.random() * 1);
            System.out.println(shape[i].toString());
        }
    }
}


