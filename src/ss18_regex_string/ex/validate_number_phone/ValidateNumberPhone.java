package ss18_regex_string.ex.validate_number_phone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PATTERN = "^\\d{2}-0\\d{9}$";
        System.out.println("Nhập vào 1 chuỗi để kiểm tra");
        String str = sc.nextLine();
        System.out.println(Pattern.matches(PATTERN, str));
    }
}
