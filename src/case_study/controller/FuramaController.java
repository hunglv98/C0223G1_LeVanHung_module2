package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private EmployeeManagement employeeManagement = new EmployeeManagement();
    private CustomerManagement customerManagement = new CustomerManagement();
    private FacilityManagement facilityManagement = new FacilityManagement();
    private BookingManagement bookingManagement = new BookingManagement();
    private PromotionManagement promotionManagement = new PromotionManagement();
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //    public static void main(String[] args) {
//        System.out.println(ANSI_RED + "This text is red!" + ANSI_RED);
//    }
    public void showMainMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("-----Furama Management-----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Enter your choice: ");
            int input = -1;
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 6) {
                    throw new Exception("Nhập từ 1-6");
                }
            } catch (NumberFormatException n) {
                System.out.println(ANSI_RED + "Chỉ nhập số" + ANSI_RESET);

            } catch (Exception e) {
                System.out.println(e);
            }
            switch (input) {
                case 1:
                    employeeManagement.showEmployeeMenu();
                    break;
                case 2:
                    customerManagement.showCustomerMenu();
                    break;
                case 3:
                    facilityManagement.showFacilityMenu();
                    break;
                case 4:
                    bookingManagement.showBookingMenu();
                    break;
                case 5:
                    promotionManagement.showPromotionMenu();
                    break;
                case 6:
                    System.exit(1);
                default:
                    break;
            }
        } while (true);
    }
}
