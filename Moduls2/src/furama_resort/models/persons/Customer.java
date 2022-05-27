package furama_resort.models.persons;

import furama_resort.controllers.FuramaControllers;

import java.util.Scanner;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int code, String name, int old, String gender, int id, long numberPhone,
                    String email, String typeCustomer, String address) {
        super(code, name, old, gender, id, numberPhone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Diamond. \n" +
                "2.Platinum. \n" +
                "3.Gold. \n" +
                "4.Silver. \n" +
                "5.Member");
        do {
            System.out.println("Enter level: ");
            int level = Integer.parseInt(input.nextLine());
            if (level >= 1 && level <= 5) {
                switch (level) {
                    case 1:
                        return "Diamon";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                }
                break;
            } else {
                System.out.println("nhap laij");
            }
        } while (true);
        return "";
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
