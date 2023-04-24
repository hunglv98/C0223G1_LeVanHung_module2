package ss17_serialization.ex.binary_file.service;

import ss17_serialization.ex.binary_file.common.Read;
import ss17_serialization.ex.binary_file.common.Write;
import ss17_serialization.ex.binary_file.model.Product;
import ss17_serialization.ex.binary_file.repo.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepo productRepo = new ProductRepo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showList() {
        List<Product> list = productRepo.getList();
        for (Product p : list
        ) {
            System.out.println(p);
        }
    }

    //public Product(String id, String name, double price, String manufacturer, String description) {
    @Override
    public void addList() {
        System.out.println("Nhập vào id");
        String id = sc.nextLine();
        System.out.println("Nhập vào tên");
        String name = sc.nextLine();
        System.out.println("Nhập vào giá");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào nhà sản xuất");
        String manufacturer = sc.nextLine();
        System.out.println("Nhập vào mô tả");
        String description = sc.nextLine();
        Product product = new Product(id, name, price, manufacturer, description);
        productRepo.addProduct(product);
    }

    @Override
    public void checkList() {
        System.out.println("Nhập vào id cần tìm");
        String id = sc.nextLine();
        if (productRepo.checkProduct(id) == -1) {
            System.out.println("không có id này");
        } else
            System.out.println("Đã tìm thấy đối tượng");
        System.out.println(productRepo.getList().get(productRepo.checkProduct(id)));
    }
}
