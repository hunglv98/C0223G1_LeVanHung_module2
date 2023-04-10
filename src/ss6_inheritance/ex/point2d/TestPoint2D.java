package ss6_inheritance.ex.point2d;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ x");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập tọa độ y");
        float y = Float.parseFloat(sc.nextLine());
        Point2D point2D = new Point2D(x, y);
        float[] array = point2D.getXY();
        System.out.println(Arrays.toString(array));
    }
}
