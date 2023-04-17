package ss10_arrayList.ex.management_codegym.repository;

import ss10_arrayList.ex.management_codegym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getListStudent();
    void addStudent(Student student);
    boolean deleteStudentById(String id);
}
