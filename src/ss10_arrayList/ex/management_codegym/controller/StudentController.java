package ss10_arrayList.ex.management_codegym.controller;

import ss10_arrayList.ex.management_codegym.service.StudentService;
import ss10_arrayList.ex.management_codegym.service.TeacherService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    private TeacherService teacherService = new TeacherService();

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("-----Quản lý-----\n" +
                "1. Quản lý Sinh Viên\n" +
                "2. Quản lý Giáo Viên\n" +
                "3. Thoát\n" +
                "Mời bạn chọn chương trình quản lý\n");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            do {
                System.out.print("-----Quản lý sinh viên-----\n" +
                        "1. Thêm mới học viên \n" +
                        "2. Xoá học viên \n" +
                        "3. Xem danh sách học viên \n" +
                        "0. Thoát \n" +
                        "Mời chọn chức năng: ");
                String input = sc.nextLine();
                switch (input) {
                    case "1":
                        // them moi.
                        studentService.addNewStudent();
                        break;
                    case "2":
                        // xoa
                        studentService.deleteStudent();
                        break;
                    case "3":
                        studentService.displayStudentList();
                        // xem danh sach
                        break;
                    case "0":
                        flag = false;
                        System.out.println("Thoat quan ly sinh vien.");
                        System.exit(1);
                        // thoat
                        break;
                    default:
                        System.out.println("Ban chon chua dung chuc nang!");
                }
            } while (flag);
        } else if (choice.equals("2")) {
            do {
                System.out.print("-----Quản lý Giáo Viên-----\n" +
                        "1. Thêm mới giáo viên \n" +
                        "2. Xoá giáo viên \n" +
                        "3. Xem danh sách giáo viên \n" +
                        "0. Thoát \n" +
                        "Mời chọn chức năng: ");
                String input = sc.nextLine();
                switch (input) {
                    case "1":
                        // them moi.
                        teacherService.addTeacherById();
                        break;
                    case "2":
                        // xoa
                        teacherService.deleteTeacherById();
                        break;
                    case "3":
                        teacherService.showTeacherList();
                        // xem danh sach
                        break;
                    case "0":
                        flag = false;
                        System.out.println("Thoat quan ly giao vien.");
                        System.exit(1);
                        // thoat
                        break;
                    default:
                        System.out.println("Ban chon chua dung chuc nang!");
                }
            } while (flag);
        } else System.exit(1);
    }
}
