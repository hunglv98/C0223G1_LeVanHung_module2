package ss10_arrayList.ex.managementCodeGym.repository;

import ss10_arrayList.ex.managementCodeGym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getListStudent();
    void addStudent(Student student);
    boolean deleteStudentById(String id);
}
