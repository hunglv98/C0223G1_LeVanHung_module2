package ss2_loop.prac;
import java.util.Scanner;
public class Practise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        double money = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lãi suất hàng tháng");
        double rate = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tháng muốn gởi");
        int month = Integer.parseInt(sc.nextLine());
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += money* (rate/100)/12*month;
        }
        System.out.println("Tiền lãi là " + interest);
    }
}
