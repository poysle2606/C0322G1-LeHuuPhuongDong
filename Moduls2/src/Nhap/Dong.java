package Nhap;

public class Dong implements Human{
    @Override
    public void eat() {
        System.out.println("Dong eating rice.");
    }

    @Override
    public void walk() {
        System.out.println("By moto");
    }
}
