package case_study.utils;

import case_study.model.*;
import case_study.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCustomer {
    public static String PATH_FILE = "src/case_study/data/Customer.csv";
    public static void write(List<Customer> list){
        File file = new File(PATH_FILE);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer e: list) {
                bufferedWriter.write(e.writeCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> read(){
        List<Customer> list = new ArrayList<>();
        File file = new File(PATH_FILE);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            String arr[];
            while ((temp= bufferedReader.readLine())!=null){
                arr = temp.split(",");
                Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],(arr[4]),(arr[5]),arr[6], CustomerType.valueOf(arr[7]),arr[8]);
                list.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
