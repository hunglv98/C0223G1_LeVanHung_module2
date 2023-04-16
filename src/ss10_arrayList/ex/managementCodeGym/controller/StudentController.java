package ss10_arrayList.ex.managementCodeGym.controller;

import ss10_arrayList.ex.managementCodeGym.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("-----Quản lý sinh viên-----\n" +
                    "1. Thêm mới học viên \n" +
                    "2. Xoá học viên \n" +
                    "3. Xem danh sách học viên \n" +
                    "0. Thoát \n" +
                    "Mời chọn chức năng: ");
            String input = sc.nextLine();
            switch (input){
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
                    // thoat
                    break;
                default:
                    System.out.println("Ban chon chua dung chuc nang!");
            }
        } while (flag);
    }
}
