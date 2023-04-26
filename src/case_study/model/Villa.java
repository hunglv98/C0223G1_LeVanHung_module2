package case_study.model;

public class Villa extends Facility {
    private String standardRoom;
    private double poolArea;
    private int numberFloor;

    public Villa(String standardRoom, double poolArea, int numberFloor) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, double poolArea, int numberFloor) {
        super(id, name, usedArea, rentCost, numberPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
