package furama_resort.models;

public class Booking {
    private int codeBooking;
    private int startDay;
    private int endDay;
    private int codeCustomer;
    private String nameService;
    private String typeService;

    public Booking() {
    }

    public Booking(int codeBooking, int startDay, int endDay, int codeCustomer, String nameService, String typeService) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.codeCustomer = codeCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", codeCustomer=" + codeCustomer +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
