package Controllers;

public abstract class Facility {
    private int numberOfRoom;
    private String color;
    private double length;
    private double weight;
    private double height;
    private double price;

    public Facility() {

    }

    public Facility(int numberOfRoom, String color, double length, double weight, double height, double price) {
        this.numberOfRoom = numberOfRoom;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.height = height;
        this.price = price;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
