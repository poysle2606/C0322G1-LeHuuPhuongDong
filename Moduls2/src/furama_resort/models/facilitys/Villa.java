package furama_resort.models;

public class Villa extends Facility {
    private String roomStandard;     //tiêu chuẩn phòng.
    private int areaPool;
    private int numberFloor;

    public Villa() {

    }

    public Villa(String nameService, double area, double price, int maximumOfPeople, String rentalType,
                 String roomStandard, int areaPool, int numberFloor) {
        super(nameService, area, price, maximumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandard, int areaPool, int numberFloor) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Villa included " +
                "Standard of Room: '" + roomStandard + '\'' +
                ", are of Pool=" + areaPool +
                ", number of floor is: " + numberFloor;
    }
}