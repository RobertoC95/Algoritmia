package Ex_02;

public class NoDiscountStrategy implements DiscoutStrategy {

    @Override
    public double calculateTotal(double valor) {
        return valor;
    }
}
