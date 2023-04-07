package ss5_access_modifier.ex.student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    Student(){
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
