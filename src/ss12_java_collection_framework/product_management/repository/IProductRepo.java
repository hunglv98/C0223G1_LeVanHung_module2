package ss12_java_collection_framework.product_management.repository;

import ss12_java_collection_framework.product_management.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getListProduct();

    void addProduct(Product product);

    void editProduct(String input, String id, String name, int price);

    boolean checkProduct(String id);

    void deleteProduct(String id);

    void checkName(String name);
}
