package ss10_arrayList.ex.management_codegym.repository;

import ss10_arrayList.ex.management_codegym.model.Student;
import ss10_arrayList.ex.management_codegym.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();
    void addTeacherList(Teacher teacher);
    boolean checkTeacherById(String id);
    void deleteTeacher(String id);
}
