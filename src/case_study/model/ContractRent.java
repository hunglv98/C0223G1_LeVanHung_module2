package case_study.model;

public class ContractRent {
    private String idContract;
    private String idBooking;
    private double deposit;
    private double amountOfContract;

    public ContractRent() {
    }

    public ContractRent(String idContract, String idBooking, double deposit, double amountOfContract) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.amountOfContract = amountOfContract;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getAmountOfContract() {
        return amountOfContract;
    }

    public void setAmountOfContract(double amountOfContract) {
        this.amountOfContract = amountOfContract;
    }

    @Override
    public String toString() {
        return "ContractRent{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", amountOfContract=" + amountOfContract +
                '}';
    }
}
