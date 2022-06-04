package quan_ly_du_an.person;

import java.time.LocalDate;

public abstract class Patient {
    private int numericalOder;
    private String patient;
    private String sicker;
    private String name;
    private String startDay;
    private String endDay;
    private String reason;


    public Patient() {
    }

    public Patient(int numericalOder, String patient,String sicker, String name, String startDay, String endDay, String reason) {
        this.numericalOder = numericalOder;
        this.patient = patient;
        this.sicker = sicker;
        this.name = name;
        this.startDay = startDay;
        this.endDay = endDay;
        this.reason = reason;
    }

    public String getSicker() {
        return sicker;
    }

    public void setSicker(String sicker) {
        this.sicker = sicker;
    }

    public abstract String inFor();

    public int getNumericalOder() {
        return numericalOder;
    }

    public void setNumericalOder(int numericalOder) {
        this.numericalOder = numericalOder;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "numericalOder=" + numericalOder +
                ", patient='" + patient + '\'' +
                ", sicker='" + sicker + '\'' +
                ", name='" + name + '\'' +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", reason='" + reason + '\'' +
                '}';
    }
}
