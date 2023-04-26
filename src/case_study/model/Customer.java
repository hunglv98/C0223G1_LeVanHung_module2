package case_study.model;

public class Customer extends Person {
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(CustomerType customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, double identifyNumber, double phoneNumber, String email, CustomerType customerType, String address) {
        super(id, name, dateOfBirth, gender, identifyNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType=" + customerType +
                ", address='" + address + '\'' +
                '}';
    }
}
