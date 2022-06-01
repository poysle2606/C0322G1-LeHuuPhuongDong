package furama_resort.models.persons;

import java.util.Scanner;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getCode(),
                super.getName(),
                super.getOld(),
                super.getGender(),
                super.getId(),
                super.getNumberPhone(),
                super.getEmail());
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int code, String name, String old, String gender, int id, long numberPhone,
                    String email, String typeCustomer, String address) {
        super(code, name, old, gender, id, numberPhone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer have " +
                super.toString() +
                "type of Customer is: " + typeCustomer +
                ", address is: " + address;

    }
}
