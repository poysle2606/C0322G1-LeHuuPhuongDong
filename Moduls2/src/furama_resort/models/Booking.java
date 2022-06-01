package furama_resort.models;

import furama_resort.models.facilitys.Facility;
import furama_resort.models.persons.Customer;

public class Booking {
    private int codeBooking;
    private String startDay;
    private String endDay;
    private int idCustomer;
    private String nameFacility;
    private String facility;

    public Booking(int codeBooking, String startDay, String endDay,
                   int idCustomer, String nameFacility, String facility) {
        this.codeBooking = codeBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.nameFacility = nameFacility;
        this.facility = facility;
    }

    public Booking() {
    }


    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking List have " +
                "codeBooking= " + codeBooking +
                ", startDay is " + startDay +
                ", endDay is " + endDay +
                ", idCustomer= " + idCustomer +
                ", nameFacility is " + nameFacility +
                ", facility is " + facility;

    }

}
