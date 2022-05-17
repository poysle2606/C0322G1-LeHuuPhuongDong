package controllers.models;

import controllers.models.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String nameService, double area, double price, int maximumOfPeople,
                String rentalType, String serviceFree) {
        super(nameService, area, price, maximumOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Room included: " +
                " Service Free='" + serviceFree + '\'';

    }
}
