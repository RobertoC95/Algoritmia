package Ex_02;

public class PercentageDiscountStrategy implements DiscoutStrategy{
    private double percentageDiscount;

    public PercentageDiscountStrategy(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public double calculateTotal(double valor) {
        return valor*(1-percentageDiscount);
    }
}
