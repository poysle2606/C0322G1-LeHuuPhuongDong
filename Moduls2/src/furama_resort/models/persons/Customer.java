package furama_resort.models.persons;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int code, String name, int old, String gender, int id, int numberPhone,
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
