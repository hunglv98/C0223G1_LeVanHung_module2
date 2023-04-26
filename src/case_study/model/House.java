package case_study.model;

public class House extends Facility {
    private String standardRoom;
    private int numberFloor;

    public House(String standardRoom, int numberFloor) {
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public House(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, int numberFloor) {
        super(id, name, usedArea, rentCost, numberPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
