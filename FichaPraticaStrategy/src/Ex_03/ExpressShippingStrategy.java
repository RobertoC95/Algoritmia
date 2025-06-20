package Ex_03;

import Ex_02.DiscoutStrategy;

public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double peso) {
        return peso * 10;
    }
}
