package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    public void showPromotionMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("-----Promotion Management-----\n" +
                    "1. Display list customers use service \n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu \n" +
                    "Enter your choice: ");
            int input = -1;
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 3) {
                    throw new Exception("Nhập từ 1-3");
                }
            } catch (NumberFormatException n) {
                System.out.println("Chỉ nhập số");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (input) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                   break;
                default:
                    break;
            }
        } while (flag);
    }
}
