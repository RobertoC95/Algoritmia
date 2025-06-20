package Ex_03;

import Ex_02.DiscoutStrategy;

public class OvernightShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double peso) {
        return peso * 15;
    }
}
