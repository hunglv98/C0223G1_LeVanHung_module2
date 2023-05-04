package case_study.controller;

import case_study.service.BookingService;

import java.util.Scanner;

public class BookingManagement {
    private BookingService bookingService = new BookingService();
    public void showBookingMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("-----Booking Management-----\n" +
                    "1. Add new booking \n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts \n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Enter your choice: ");
            int input = -1;
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 6) {
                    throw new Exception("Nhập từ 1-6");
                }
            } catch (NumberFormatException n) {
                System.out.println("Chỉ nhập số");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (input) {
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.showList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }
}
