package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.product_management.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepo implements IProductRepo {
    public static ArrayList<Product> products = new ArrayList<>();

    //      public Product(String id, int price, String name) {
    static {
        products.add(new Product("1", 15000, "Tiger"));
        products.add(new Product("2", 12000, "Largue"));
        products.add(new Product("3", 18000, "Heineken"));
        products.add(new Product("4", 22000, "Budweiser"));
    }

    @Override
    public List<Product> getListProduct() {
        products.sort(Comparator.comparing(Product::getPrice));
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(String input, String id, String name, int price) {
        for (Product p : products) {
            if (p.getId().equals(input)) {
                p.setId(id);
                p.setName(name);
                p.setPrice(price);
                System.out.println("Sửa thành công");
                break;
            }
        }
    }

    @Override
    public boolean checkProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                products.remove(p);
                break;
            }
        }
    }

    @Override
    public void checkName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                break;
            }
        }
    }
}

