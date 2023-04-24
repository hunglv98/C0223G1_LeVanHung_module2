package ss17_serialization.ex.binary_file.view;

import ss17_serialization.ex.binary_file.controller.ProductController;
import ss17_serialization.ex.binary_file.service.ProductService;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
