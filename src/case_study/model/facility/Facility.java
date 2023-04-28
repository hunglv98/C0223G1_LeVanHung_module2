package case_study.model.facility;

public abstract class Facility {
    private String id;
    private String name;
    private double usedArea;
    private double rentCost;
    private int numberPeople;
    private String typeOfRent;

    public Facility() {
    }

    public Facility(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent) {
        this.id = id;
        this.name = name;
        this.usedArea = usedArea;
        this.rentCost = rentCost;
        this.numberPeople = numberPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usedArea=" + usedArea +
                ", rentCost=" + rentCost +
                ", numberPeople=" + numberPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
