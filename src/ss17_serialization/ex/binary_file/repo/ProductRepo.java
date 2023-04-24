package ss17_serialization.ex.binary_file.repo;

import ss17_serialization.ex.binary_file.common.Read;
import ss17_serialization.ex.binary_file.common.Write;
import ss17_serialization.ex.binary_file.model.Product;
import ss17_serialization.ex.binary_file.service.ProductService;

import java.util.List;

public class ProductRepo implements IProductRepo {
    @Override
    public List<Product> getList() {
        return Read.read();
    }

    @Override
    public void addProduct(Product product) {
        List<Product> list = Read.read();
        list.add(product);
        Write.write(list);
    }

    @Override
    public int checkProduct(String id) {
        List<Product> list = Read.read();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return index = i;
            }
        }
        return index;
    }
}
