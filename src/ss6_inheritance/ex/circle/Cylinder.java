package ss6_inheritance.ex.circle;

import ss6_inheritance.ex.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    Cylinder(double number, String color, double height) {
        super(number, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
