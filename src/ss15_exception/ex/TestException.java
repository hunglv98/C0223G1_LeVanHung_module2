package ss15_exception.ex;

import java.util.Scanner;

public class TestException {
    static void test(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Cạnh bé hơn 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Hai cạnh cộng lại bé hơn cạnh còn lại");
        } else
            System.out.println("Continue");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a");
            double a1 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh b");
            double b1 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh c");
            double c1 = Double.parseDouble(sc.nextLine());
            test(a1, b1, c1);
        } catch (IllegalTriangleException i) {
            System.out.println("Exception is " + i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("rest of source code...");
    }
}
