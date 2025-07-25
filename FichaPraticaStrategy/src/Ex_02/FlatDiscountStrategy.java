package Ex_02;

public class FlatDiscountStrategy implements DiscoutStrategy{
    private double fixedDiscount;

    public FlatDiscountStrategy(double fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    @Override
    public double calculateTotal(double valor) {
        return valor -this.fixedDiscount;
    }
}
