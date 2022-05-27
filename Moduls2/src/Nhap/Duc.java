package Nhap;

public class Duc implements Human{
    @Override
    public void eat() {
        System.out.println("Duc eating noodle");
    }

    @Override
    public void walk() {
        System.out.println("by otobike");
    }
}
