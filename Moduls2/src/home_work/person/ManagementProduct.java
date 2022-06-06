package home_work.person;

public class ManagementProduct extends Person {
    private String product;
    private String priceProduct;

    public ManagementProduct() {
    }

    public ManagementProduct(String product, String priceProduct) {
        this.product = product;
        this.priceProduct = priceProduct;
    }

    public ManagementProduct(int id, String codePerson, String name, String birthDay,
                             String address, String product, String priceProduct) {
        super(id, codePerson, name, birthDay, address);
        this.product = product;
        this.priceProduct = priceProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
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
