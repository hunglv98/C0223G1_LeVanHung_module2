package ss5_access_modifier.ex.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Nhập vào bán kính");
        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        Circle circle = new Circle(input);
        System.out.println("Diện tích của hình tròn bằng " + circle.getArea());
    }
}
