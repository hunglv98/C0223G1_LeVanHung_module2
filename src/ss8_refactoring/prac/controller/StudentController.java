package ss8_refactoring.prac.controller;

import ss8_refactoring.prac.service.IStudentService;
import ss8_refactoring.prac.service.StudentService;

public class StudentController implements IStudentController {
    private IStudentService iStudentService = new StudentService();

    @Override
    public void showListStudent() {
        iStudentService.showListStudent();
    }
}
