package ss4_oop.ex.quadratic;

import java.util.Scanner;

public class ManageQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị của a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào giá trị của b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào giá trị của c");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm là " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm là " + (-b) / 2 / a);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
