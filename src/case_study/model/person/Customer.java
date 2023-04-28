package case_study.model.person;

import case_study.model.CustomerType;
import case_study.model.person.Person;

public class Customer extends Person {
    private CustomerType customerType;
    private String address;

    public Customer() {
    }

    public Customer(CustomerType customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String identifyNumber, String phoneNumber, String email, CustomerType customerType, String address) {
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
        return "Customer{" + super.toString()+
                "customerType=" + customerType +
                ", address='" + address + '\'' +
                '}';
    }
    public String writeCsv() {
        return getId() + "," + getName() + "," + getDateOfBirth() + "," + getGender() + "," + getIdentifyNumber() + "," + getPhoneNumber() + "," + getEmail() + "," + this.customerType + "," + this.address;
    }
}
