package ss17_serialization.ex.binary_file.common;

import ss17_serialization.ex.binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static List<Product> read() {
        List<Product> list = new ArrayList<>();
        String PATH_SOURCE_FILE = "src/ss17_serialization/ex/binary_file/text.txt";
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH_SOURCE_FILE);
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
