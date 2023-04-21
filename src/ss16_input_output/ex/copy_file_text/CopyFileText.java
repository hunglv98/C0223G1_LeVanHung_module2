package ss16_input_output.ex.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        String PATH = "src/ss16_input_output/source.txt";
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                list.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String PathResult = "src/ss16_input_output/target.txt";
        File file1 = new File(PathResult);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        int count = 0;
        try {
            fileWriter = new FileWriter(file1, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                count += s.length();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Số lượng ký tự là " + count);
    }
}
