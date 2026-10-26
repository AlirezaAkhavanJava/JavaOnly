package fourPillars.checkout.paymentMethods;

import fourPillars.checkout.PaymentMethod;

public class CreditCard implements PaymentMethod {
    public void charge(double amount){

    }

    public void chargeCard(double amount) {

    }

    @Override
    public void pay(double amount) {
        // Specific logic for Credit card
    }
}
