package ss7_abstraction.ex.resizeable;

public class Square extends Shape {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimeter() {
        return size * 4;
    }

    @Override
    public String toString() {
        return "Square{"
                + "size="
                + size
                + " getArea= "
                + getArea()
                + '}';
    }

    @Override
    public void resize(double percent) {
        this.size = size * percent + size;
    }
}
