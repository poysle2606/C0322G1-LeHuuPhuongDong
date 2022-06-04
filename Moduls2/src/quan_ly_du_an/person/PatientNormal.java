package quan_ly_du_an.person;

import java.time.LocalDate;

public class PatientNormal extends Patient{
    private double money;

    public PatientNormal() {
    }

    public PatientNormal(double money) {
        this.money = money;
    }

    public PatientNormal(int numericalOder, String patient, String sicker, String name,
                         String startDay, String endDay, String reason, double money) {
        super(numericalOder, patient, sicker, name, startDay, endDay, reason);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getNumericalOder(),
                super.getPatient(),
                super.getSicker(),
                super.getName(),
                super.getStartDay(),
                super.getEndDay(),
                super.getReason(),
                getMoney());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Phí nằm viện =" + money;
    }
}
