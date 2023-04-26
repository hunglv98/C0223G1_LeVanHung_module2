package case_study.model;

public class Employee extends Person {
    private Academy academy;
    private Position position;
    private String wage;

    public Employee() {
    }

    public Employee(Academy academy, Position position, String wage) {
        this.academy = academy;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String id, String name, String dateOfBirth, String gender, double identifyNumber, double phoneNumber, String email, Academy academy, Position position, String wage) {
        super(id, name, dateOfBirth, gender, identifyNumber, phoneNumber, email);
        this.academy = academy;
        this.position = position;
        this.wage = wage;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "academy=" + academy +
                ", position=" + position +
                ", wage='" + wage + '\'' +
                '}';
    }
}
