package ss11_java_colection_framework.excersie;


public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String production;

    public Product() {
    }

    public Product(int id, String name, int price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(int price) {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount(int amount) {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction(String production) {
        return this.production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = " + id +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", production='" + production;
    }

    @Override
    public int compareTo(Product o) {

        //  return Integer.compare(this.getPrice(price), o.getPrice(price));

        if (this.getPrice(price) > o.getPrice(price)) {
            return 1;
        } else if (this.getPrice(price) < o.getPrice(price)) {
            return -1;
        } else {
            return 0;
        }
    }
}
