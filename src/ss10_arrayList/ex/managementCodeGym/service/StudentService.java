package ss10_arrayList.ex.managementCodeGym.service;

import ss10_arrayList.ex.managementCodeGym.model.Student;
import ss10_arrayList.ex.managementCodeGym.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void displayStudentList() {
        List<Student> studentList = studentRepository.getListStudent();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    //    Student(String id, String name, String dateOfBirth, String gender, String className, double grade)
    @Override
    public void addNewStudent() {
        System.out.println("Mời bạn nhập id");
        String id = sc.nextLine();
        System.out.println("Mời bạn nhập tên");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Mời bạn nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Mời bạn nhập lớp");
        String classes = sc.nextLine();
        System.out.println("Mời bạn nhập điểm");
        double grade = Double.parseDouble(sc.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, classes, grade);
        studentRepository.addStudent(student);
        System.out.println("Đã thêm thành công học sinh " + student.getName());
    }

    @Override
    public void deleteStudent() {
        System.out.println("Nhập vào id cần xóa");
        String inputId = sc.nextLine();
       if(studentRepository.deleteStudentById(inputId)){
           System.out.println("xóa thành công");
       }else System.out.println("Không tìm thấy ID này");
    }
}
