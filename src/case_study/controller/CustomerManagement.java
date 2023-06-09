package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    private CustomerService customerService = new CustomerService();
    public void showCustomerMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("-----Customer Management-----\n" +
                    "1. Display list customers \n" +
                    "2. Add new customer\n" +
                    "3. Edit customer \n" +
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
                    customerService.showList();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        } while (flag);
    }
}
