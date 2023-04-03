package ss1_intro.ex;
import java.util.Scanner;
public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập vào giá trị USD");
        double usd = Double.parseDouble(sc.nextLine()) ;
        double vnd = usd * rate;
        System.out.println("Giá trị VND bằng "+vnd);
    }
}
