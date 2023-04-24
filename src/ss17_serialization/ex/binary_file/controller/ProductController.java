package ss17_serialization.ex.binary_file.controller;

import ss17_serialization.ex.binary_file.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----Quản lý sản phẩm-----\n" +
                    "1. Hiển thị sản phẩm\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "4. Thoát\n" +
                    "Mời bạn nhập lựa chọn\n");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    productService.showList();
                    break;
                case 2:
                    productService.addList();
                    break;
                case 3:
                    productService.checkList();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
