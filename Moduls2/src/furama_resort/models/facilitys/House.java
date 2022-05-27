package furama_resort.models.facilitys;

public class House extends Facility {
    private String roomStandard;
    private int numberFloorOfHouse;

    public House() {

    }

    public House(String nameService, double area, double price,
                 int maximumOfPeople, String rentalType,
                 String roomStandard, int numberFloorOfHouse) {
        super(nameService, area, price, maximumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloorOfHouse = numberFloorOfHouse;
    }

    public House(String roomStandard, int numberFloorOfHouse) {
        this.roomStandard = roomStandard;
        this.numberFloorOfHouse = numberFloorOfHouse;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloorOfHouse() {
        return numberFloorOfHouse;
    }

    public void setNumberFloorOfHouse(int numberFloorOfHouse) {
        this.numberFloorOfHouse = numberFloorOfHouse;
    }

    @Override
    public String toString() {
        return super.toString() +
                "House included: " +
                " Standard of Room '" + roomStandard + '\'' +
                ", number Floor of House=" + numberFloorOfHouse;

    }
}
