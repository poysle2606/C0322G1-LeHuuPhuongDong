package Nhap;

public class Animals {
    private String name;
    private int age;
    private String color;

    public Animals() {

    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) {
            return true;
        }
        if ( this == null) {
            return false;
        }
        return true;
    }
}
