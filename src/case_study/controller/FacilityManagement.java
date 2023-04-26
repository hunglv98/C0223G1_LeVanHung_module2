package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    public void showFacilityMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("-----Facility Management-----\n" +
                    "1. Display list facilities \n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance \n" +
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
