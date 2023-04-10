package ss6_inheritance.ex.circle;

import ss6_inheritance.ex.circle.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.9, "red", 1.5);
        System.out.println("Thể tích hình trụ " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
