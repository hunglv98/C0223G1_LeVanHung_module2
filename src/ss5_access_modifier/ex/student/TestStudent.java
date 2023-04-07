package ss5_access_modifier.ex.student;
import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        String name = sc.nextLine();
        System.out.println("Nhập vào lớp");
        String classes = sc.nextLine();
        Student student1 = new Student();
        student1.setClasses(classes);
        student1.setName(name);
        System.out.println(student1.toString());
    }
}
