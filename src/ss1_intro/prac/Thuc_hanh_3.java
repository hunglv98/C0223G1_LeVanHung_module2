
import java.util.Scanner;
public class Thuc_hanh_3 {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = scanner.nextFloat();
        System.out.println("Enter the height: ");
        height=scanner.nextFloat();
        float area = height * width;
        System.out.println("Area is "+area);
    }
}
