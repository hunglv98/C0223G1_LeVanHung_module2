package ss10_arrayList.ex.managementCodeGym.repository;

import ss10_arrayList.ex.managementCodeGym.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    public static ArrayList<Student> studentList = new ArrayList<>();

    static {
//            Student(String id, String name, String dateOfBirth, String gender, String className, double grade)
        studentList.add(new Student("1", "Hưng", "06/04/1998", "Nam", "C0223G1", 9.5));
        studentList.add(new Student("2", "Hoa", "07/04/1998", "Nữ", "C0223G1", 8.5));
        studentList.add(new Student("3", "Thái", "08/04/1998", "Nam", "C0223G1", 7.5));
        studentList.add(new Student("4", "Kiệt", "09/04/1998", "Nam", "C0223G1", 6.5));
    }

    @Override
    public List<Student> getListStudent() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudentById(String id) {
        for (Student s: studentList) {
            if(s.getId().equals(id)){
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }
}
