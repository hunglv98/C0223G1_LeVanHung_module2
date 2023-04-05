package ss2_loop.ex;

import java.util.Scanner;

public class Ex1Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = -1;
        while (input != 4) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter the number:");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i >= j) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i + j <= 6) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j + i >= 6) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6 * 2; j++) {
                            if (j > 6 - i && j < 6 + i) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có!");
            }
        }
    }
}
