package furama_resort.models.facilitys;

public class Room extends Facility {
    private String serviceFree;

    public Room() {

    }

    @Override
    public String information() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getIdService(),
                super.getNameService(),
                super.getArea(),
                super.getPrice(),
                super.getMaximumOfPeople(),
                super.getRentalType2(),
                getServiceFree());
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String idService,String nameService, double area, double price, int maximumOfPeople,
                String rentalType, String serviceFree) {
        super(idService,nameService, area, price, maximumOfPeople, rentalType);
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
