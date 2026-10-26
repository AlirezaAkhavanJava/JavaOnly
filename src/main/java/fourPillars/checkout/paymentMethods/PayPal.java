package fourPillars.checkout.paymentMethods;

import fourPillars.checkout.PaymentMethod;

public class PayPal implements PaymentMethod {
    public void sendPayPal(double amount) {

    }

    @Override
    public void pay(double amount) {
        //Specific logic for PayPal
    }
}
