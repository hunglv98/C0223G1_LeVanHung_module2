package ss6_inheritance.ex.circle;

import ss6_inheritance.ex.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5, "green");
        System.out.println("Diện tích hình tròn bằng " + circle.getArea());
    }
}
