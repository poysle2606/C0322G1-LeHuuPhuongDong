package quan_ly_du_an.person;

import java.time.LocalDate;
import java.util.Scanner;

public class PatientVip extends Patient {
    private String vip;
    private LocalDate vipDate;

    public PatientVip() {
    }

    public PatientVip(int numericalOder, String patient, String sicker, String name, String startDay,
                      String endDay, String reason, String vip, LocalDate vipDate) {
        super(numericalOder, patient, sicker, name, startDay, endDay, reason);
        this.vip = vip;
        this.vipDate = vipDate;
    }

    public PatientVip(String vip) {
        this.vip = vip;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public LocalDate getVipDate() {
        return vipDate;
    }

    public void setVipDate(LocalDate vipDate) {
        this.vipDate = vipDate;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOder(),
                super.getPatient(),
                super.getSicker(),
                super.getName(),
                super.getStartDay(),
                super.getEndDay(),
                super.getReason(),
                getVip(),
                getVipDate());
    }
}
