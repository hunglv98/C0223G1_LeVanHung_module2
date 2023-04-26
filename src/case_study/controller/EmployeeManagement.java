package case_study.controller;

import java.util.Scanner;

public class EmployeeManagement {
    public void showEmployeeMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("-----Employee Management-----\n" +
                    "1. Display list employees \n" +
                    "2. Add new employee\n" +
                    "3. Edit employee \n" +
                    "4. Return main menu\n" +
                    "Enter your choice: ");
            int input = -1;
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 4) {
                    throw new Exception("Nhập từ 1-4");
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
                    break;
                case 4:
                    furamaController.showMainMenu();
                default:
                    break;
            }
        } while (true);
    }
}
