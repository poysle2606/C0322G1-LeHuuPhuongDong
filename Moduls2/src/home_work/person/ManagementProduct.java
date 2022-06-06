package home_work.person;

public class ManagementProduct extends Person {
    private int product;
    private double priceProduct;

    public ManagementProduct() {
    }

    public ManagementProduct(int product, double priceProduct) {
        this.product = product;
        this.priceProduct = priceProduct;
    }

    public ManagementProduct(int id, String codePerson, String name, String birthDay,
                             String address, int product, double priceProduct) {
        super(id, codePerson, name, birthDay, address);
        this.product = product;
        this.priceProduct = priceProduct;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCodePerson(),
                super.getName(),
                super.getBirthDay(),
                super.getAddress(),
                getProduct(),
                getPriceProduct());
    }

    @Override
    public String toString() {
        return super.toString() +
                "số lượng sản phẩm = " + product +
                ", giá sản phẩm =" + priceProduct;
    }
}
