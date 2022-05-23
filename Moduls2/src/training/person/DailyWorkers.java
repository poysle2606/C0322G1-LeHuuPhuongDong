package training.person;

import training.services.impl.TimeKeeping;

public class DailyWorkers extends Human implements TimeKeeping {
    private double dailyWork;   //số ngày công.

    public DailyWorkers() {
    }

    public DailyWorkers(double dailyWork) {
        this.dailyWork = dailyWork;
    }

    public DailyWorkers(String name, String dateBirth, String address, double dailyWork) {
        super(name, dateBirth, address);
        this.dailyWork = dailyWork;
    }

    public double getDailyWork() {
        return dailyWork;
    }

    public void setDailyWork(double dailyWork) {
        this.dailyWork = dailyWork;
    }

    @Override
    public String toString() {
        return "DailyWorkers " + super.toString() + "dailyWork=" + dailyWork + " salary = " + salary();
    }

    @Override
    public double salary() {
        return dailyWork * 120.000;
    }

    @Override
    public void timeKeeping() {
        System.out.println("I have Timed.");
    }
}