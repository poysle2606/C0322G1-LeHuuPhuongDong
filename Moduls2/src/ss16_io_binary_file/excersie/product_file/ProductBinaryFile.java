package ss16_io_binary_file.excersie.product_file;

import java.io.Serializable;

public class ProductBinaryFile implements Serializable {
    private int code;
    private String name;
    private String Production;
    private double price;

    public ProductBinaryFile() {
    }

    public ProductBinaryFile(int code, String name, String production, double price) {
        this.code = code;
        this.name = name;
        Production = production;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return Production;
    }

    public void setProduction(String production) {
        Production = production;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductBinaryFile{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", Production='" + Production + '\'' +
                ", price=" + price +
                '}';
    }
}
