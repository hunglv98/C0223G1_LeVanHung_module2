package ss12_java_collection_framework.product_management.service;

import ss12_java_collection_framework.product_management.model.Product;
import ss12_java_collection_framework.product_management.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepo productRepo = new ProductRepo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showProductList() {
        List<Product> productList = productRepo.getListProduct();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Mời nhập vào Id cần sửa");
        String input = sc.nextLine();
        if (productRepo.checkProduct(input)) {
            System.out.println("Nhập vào ID");
            String id = sc.nextLine();
            System.out.println("Nhập vào tên sản phẩm");
            String name = sc.nextLine();
            System.out.println("Nhập vào giá");
            int price = Integer.parseInt(sc.nextLine());
            productRepo.editProduct(input, id, name, price);
        } else System.out.println("Không tìm thấy Id này");
    }

    @Override
    public void deleteProductById() {
        System.out.println("Nhập vào id cần xóa");
        String input = sc.nextLine();
        if (productRepo.checkProduct(input)) {
            System.out.println("Bạn có muốn xóa không?\n" +
                    "1. Có \n" +
                    "2. Không\n");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                productRepo.deleteProduct(input);
            }
        } else System.out.println("Không tìm thấy Id này");
    }

    @Override
    public void addProduct() {
        System.out.println("Mời nhập vào id");
        String id = sc.nextLine();
        System.out.println("Mời nhập vào name");
        String name = sc.nextLine();
        System.out.println("Mời nhập vào giá");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, price, name);
        productRepo.addProduct(product);
        System.out.println("Đã thêm thành công " + product.getName());
    }

    @Override
    public void checkProductByName() {
        System.out.println("Nhập vào tên muốn tìm");
        String name = sc.nextLine();
        productRepo.checkName(name);
    }
}

