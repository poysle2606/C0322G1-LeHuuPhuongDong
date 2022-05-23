package training.person;

import training.services.impl.TimeKeeping;

public class ProductionStaff extends Human implements TimeKeeping {
    private int productNumber;

    public ProductionStaff() {
    }

    public ProductionStaff(int productNumber) {
        this.productNumber = productNumber;
    }

    public ProductionStaff(String name, String dateBirth, String address, int productNumber) {
        super(name, dateBirth, address);
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "ProductionStaff " + super.toString() +
                "productNumber is: " + productNumber +
                " salary = " + salary();
    }


    @Override
    public double salary() {
        return getProductNumber() * 50.000;

    }

    @Override
    public void timeKeeping() {
        System.out.println("I have timed.");
    }
}
