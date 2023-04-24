package ss17_serialization.ex.binary_file.repo;

import ss17_serialization.ex.binary_file.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getList();

    void addProduct(Product product);

    int checkProduct(String id);

}
