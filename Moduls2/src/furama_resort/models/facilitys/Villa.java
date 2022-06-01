package furama_resort.models.facilitys;

public class Villa extends Facility {
    private String roomStandard;     //tiêu chuẩn phòng.
    private double areaPool;
    private int numberFloor;

    public Villa() {

    }

    public Villa(String idService, String nameService, double area, double price, int maximumOfPeople,
                 String rentalType, String roomStandard, double areaPool, int numberFloor) {
        super(idService, nameService, area, price, maximumOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandard, double areaPool, int numberFloor) {
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
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
                ", Standard of Room: '" + roomStandard + '\'' +
                ", are of Pool=" + areaPool + " m^2" +
                ", number of floor is: " + numberFloor;
    }
}