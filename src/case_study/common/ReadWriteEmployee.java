package case_study.common;

import case_study.model.Academy;
import case_study.model.Employee;
import case_study.model.Position;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {
    public static String PATH_FILE = "src/case_study/data/employee.csv";
    public static void write(List<Employee> list){
        File file = new File(PATH_FILE);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e: list) {
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

    public static List<Employee> read(){
        List<Employee> list = new ArrayList<>();
        File file = new File(PATH_FILE);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            String arr[];
            while ((temp= bufferedReader.readLine())!=null){
                arr = temp.split(",");
                Employee employee = new Employee(arr[0],arr[1],arr[2],arr[3],(arr[4]),(arr[5]),arr[6],Academy.valueOf(arr[7]),Position.valueOf(arr[8]),arr[9]);
                list.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
