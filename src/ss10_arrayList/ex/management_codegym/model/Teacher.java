package ss10_arrayList.ex.management_codegym.model;

public class Teacher extends Person {
    private String speciality;

    public Teacher() {
    }

    public Teacher(String speciality) {
        this.speciality = speciality;
    }

    public Teacher(String id, String name, String dateOfBirth, String gender, String speciality) {
        super(id, name, dateOfBirth, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() + '\'' +
                ", name=" + getName() +
                ", date of birth= " + getDateOfBirth() + '\'' +
                ", gender= " + getGender() +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
