package ss2_loop.ex;

public class Ex_3_display_prime_less_100 {
    public static void main(String[] args) {
        int input = 2;
        while (input<100){
            if(isPrime(input)){
                System.out.print(input + " ");
            }
            input ++;
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
