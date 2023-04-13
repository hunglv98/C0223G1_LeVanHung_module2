package ss8_refactoring.prac.repo;

import ss8_refactoring.prac.model.Student;

public class StudentRepo implements IStudentRepo {
    private static Student [] students;
    static {
        students = new Student[5];
        Student s = new Student("Hưng","abc");
        Student s1 = new Student("Hưng2","abc");
        Student s2 = new Student("Hưng3","abc");
        students[0] = s;
        students[1] = s1;
        students[2] = s2;
    }

    @Override
    public void showListStudent() {
        for(Student s: students){
            System.out.println(s);
        }
    }
}
