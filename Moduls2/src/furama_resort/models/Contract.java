package furama_resort.models;

public class Contract {
    private int codeContract;
    private int codeBooking;
    private double firstMoney;
    private double totalMoney;
    private int idCustomer;

    public Contract(int codeContract, int codeBooking, double firstMoney,
                    double totalMoney, int idCustomer) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.firstMoney = firstMoney;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    public int getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(int codeContract) {
        this.codeContract = codeContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getFirstMoney() {
        return firstMoney;
    }

    public void setFirstMoney(double firstMoney) {
        this.firstMoney = firstMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract have " +
                "codeContract= " + codeContract +
                ", codeBooking= " + codeBooking +
                ", firstMoney= " + firstMoney +
                ", totalMoney= " + totalMoney +
                ", idCustomer= " + idCustomer;
    }
}
