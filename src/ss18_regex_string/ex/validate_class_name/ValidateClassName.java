package ss18_regex_string.ex.validate_class_name;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        String PATTERN = "^(C|A|P)\\d{4}(G|H|I|K)$";
        System.out.println("Nhập vào 1 chuỗi kiểm tra");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Pattern.matches(PATTERN, str));
    }
}
