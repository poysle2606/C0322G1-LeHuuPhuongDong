package furama_resort.models.facilitys;

import java.util.Scanner;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double area;
    private double price;
    private int maximumOfPeople;
    private String rentalType;   //kiểu thuê.

    public Facility() {

    }

    public Facility(String idService, String nameService, double area, double price, int maximumOfPeople,
                    String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.maximumOfPeople = maximumOfPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
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
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want choose rental type?: ");
        do {
            System.out.println("1.Year.\n" +
                    "2.Month.\n" +
                    "3.Day.\n" +
                    "4.Hour.");
            System.out.println("Enter in here: ");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    return "Year";
                case 2:
                    return "Month";
                case 3:
                    return "Day";
                case 4:
                    return "Hour";
                default:
                    System.out.println("Enter again: ");
            }
        } while (true);
    }

    public String getRentalType2() {
        return getRentalType();
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
        return "Facility have " +
                "idService='" + idService +
                ", nameService='" + nameService +
                ", area=" + area +
                ", price=" + price +
                ", maximumOfPeople=" + maximumOfPeople +
                ", rentalType='" + rentalType;
    }
}
