package ss6_inheritance.ex.point2d;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập tọa độ y");
        float y = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập tọa độ z");
        float z = Float.parseFloat(sc.nextLine());
        Point3D point3D = new Point3D(x, y, z);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
