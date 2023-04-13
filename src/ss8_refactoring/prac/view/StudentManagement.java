package ss8_refactoring.prac.view;

import ss8_refactoring.prac.controller.IStudentController;
import ss8_refactoring.prac.controller.StudentController;
import ss8_refactoring.prac.service.IStudentService;

public class StudentManagement {
    public static void main(String[] args) {
        IStudentController iStudentController = new StudentController();
        iStudentController.showListStudent();
    }
}
