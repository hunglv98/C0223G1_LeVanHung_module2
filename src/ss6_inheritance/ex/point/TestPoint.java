package ss6_inheritance.ex.point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1.2f, 3.4f);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
