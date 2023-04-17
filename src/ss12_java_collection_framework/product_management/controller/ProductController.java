package ss12_java_collection_framework.product_management.controller;

import ss12_java_collection_framework.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.print("-----Quản Lý Sản Phẩm-----\n" +
                    "1. Hiển thị danh sách sản phẩm \n" +
                    "2. Xóa sản phẩm theo id \n" +
                    "3. Sửa sản phẩm theo id \n" +
                    "4. Thêm sản phẩm\n" +
                    "5. Tìm kiếm theo tên\n" +
                    "0. Thoát \n" +
                    "Mời bạn nhập lựa chọn \n");
            String id = sc.nextLine();
            switch (id) {
                case "1":
                    productService.showProductList();
                    break;
                case "2":
                    productService.deleteProductById();
                    break;
                case "3":
                    productService.editProduct();
                    break;
                case "4":
                    productService.addProduct();
                    break;
                case "5":
                    productService.checkProductByName();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoát chương trình quản lý thành công");
                    System.exit(1);
            }
        } while (flag);
    }
}
