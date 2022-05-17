package controllers.models;

public abstract class Facility {
    private String nameService;
    private double area;
    private double price;
    private int maximumOfPeople;
    private String rentalType;   //kiểu thuê.

    public Facility() {

    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaximumOfPeople() {
        return maximumOfPeople;
    }

    public void setMaximumOfPeople(int maximumOfPeople) {
        this.maximumOfPeople = maximumOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Facility(String nameService, double area, double price, int maximumOfPeople, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.maximumOfPeople = maximumOfPeople;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Included Facility: " +
                "Name of Service= '" + nameService + '\'' +
                ", area= " + area +
                ", price= " + price +
                ", maximum of People= " + maximumOfPeople +
                ", rental type= '" + rentalType + '\'';

    }
}
