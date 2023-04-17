package ss10_arrayList.ex.management_codegym.service;

import ss10_arrayList.ex.management_codegym.model.Teacher;
import ss10_arrayList.ex.management_codegym.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private TeacherRepository teacherRepository = new TeacherRepository();
    Scanner sc = new Scanner(System.in);
    @Override
    public void showTeacherList() {
        List<Teacher> teachers = teacherRepository.getTeacherList();
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
//    public Teacher(String id, String name, String dateOfBirth, String gender, String speciality) {
    @Override
    public void addTeacherById() {
        System.out.println("Nhập vào id");
        String id = sc.nextLine();
        System.out.println("Nhập vào tên");
        String name = sc.nextLine();
        System.out.println("Nhập vào ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập vào giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập vào chuyên môn");
        String speciality = sc.nextLine();
        Teacher newTeacher = new Teacher(id,name,dateOfBirth,gender,speciality);
        teacherRepository.addTeacherList(newTeacher);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void deleteTeacherById() {
        System.out.println("Mời bạn nhập id cần xóa");
        String input = sc.nextLine();
        if(teacherRepository.checkTeacherById(input)){
            teacherRepository.deleteTeacher(input);
        }else System.out.println("Không tìm thấy Id này");
    }
}
