package try_To_CRUD.Product;

public class Product {
    private int id;
    private String name;
    private double price;
    private int amount;
    private String national;

    public Product(int id, String name, double price, int amount, String national) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.national = national;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "Product List: "
                + "id= " + id
                + ", name= '" + name + "'"
                + ", price= "
                + price + " $ "
                + ", amount= " + amount
                + ", production= '" + national + "'.";
    }
}
