public class ElectronicProduct extends Product {

    private int warrantyMonths;

    public ElectronicProduct(String name, double price, int daysToExpire, int warrantyMonths) {
        super(name, price, daysToExpire);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return getName() + " (Electronic) - " +
                getPrice() + " birr | Warranty: " +
                warrantyMonths + " months";
    }
}
