package ss8_refactoring.prac.service;

import ss8_refactoring.prac.repo.IStudentRepo;
import ss8_refactoring.prac.repo.StudentRepo;

public class StudentService implements IStudentService {
    private IStudentRepo iStudentRepo = new StudentRepo();
    @Override
    public void showListStudent() {
        iStudentRepo.showListStudent();
    }
}
