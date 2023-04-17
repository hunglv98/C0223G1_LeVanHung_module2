package ss10_arrayList.ex.management_codegym.model;

public class Student extends Person {
    private String className;
    private double grade;

    public Student() {
    }

    public Student(String className, double grade) {
        this.className = className;
        this.grade = grade;
    }

    public Student(String id, String name, String dateOfBirth, String gender, String className, double grade) {
        super(id, name, dateOfBirth, gender);
        this.className = className;
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() + '\'' +
                ", name=" + getName() +
                ", date of birth= " + getDateOfBirth() + '\'' +
                ", gender= " + getGender() +
                ", className='" + className + '\'' +
                ", grade=" + grade +
                '}';
    }
}
