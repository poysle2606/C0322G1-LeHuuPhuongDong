package ss4_OOP.Excersie.Fan;

public class Fan {
    //Trường dữ liệu khởi tạo hằng và gán giá trị cho nó
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    // khởi tạo constructor và truyền vào tham số
    public Fan(int speed, boolean off, double radius, String color) {
        this.speed = speed;
        this.on = off;
        this.radius = radius;
        this.color = color;
    }

    // Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan() {

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString trả về chuỗi chứa thông tin của quạt
    public String toString() {
        if (this.on) {
            return "Speed is: " + this.speed + " color is: " + this.color + " radius is: " + this.radius + " fan is on.";
        } else {
            return "Color is: " + this.color + " radius is: " + this.radius + " fan is off";

        }
    }
}
