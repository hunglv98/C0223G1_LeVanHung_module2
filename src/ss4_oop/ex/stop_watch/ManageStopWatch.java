package ss4_oop.ex.stop_watch;

import java.util.Scanner;

public class ManageStopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch time = new StopWatch();
        time.start();
        System.out.println("Hãy nhập một gì đó trong khi đợi một lát");
        String a = sc.nextLine();
        System.out.println("Hãy nhập một gì đó trong khi đợi một lát");
        String b = sc.nextLine();
        System.out.println("Hãy nhập một gì đó trong khi đợi một lát");
        String c = sc.nextLine();
        System.out.println("Hãy đợi một lát");
        time.stop();
        System.out.println("Thời gian đã trôi qua tính bằng milisecond: "+time.getElapsedTime());
    }
}
