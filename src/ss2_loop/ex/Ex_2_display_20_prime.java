package ss2_loop.ex;
import java.util.Scanner;
public class Ex_2_display_20_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int n = 2;
        while(count<numbers){
            if(isPrime(n)){
                System.out.print( n +" ");
                count ++;
            }
            n++;
        }
    }
    public static boolean isPrime(int x){
        boolean flag = true;
        for (int i = 2; i <=Math.sqrt(x) ; i++) {
            if(x % i==0){
                flag = false;
                break;
            }else flag= true;
        }
        return flag;
    }
}
