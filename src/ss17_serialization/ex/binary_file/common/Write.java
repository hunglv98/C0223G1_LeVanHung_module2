package ss17_serialization.ex.binary_file.common;

import ss17_serialization.ex.binary_file.model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Write {
    public static void write(List<Product> list) {
        String PATH_SOURCE_FILE = "src/ss17_serialization/ex/binary_file/text.txt";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_SOURCE_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
