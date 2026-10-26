package fourPillars.checkout.paymentMethods;

import fourPillars.checkout.PaymentMethod;

public class ApplePay implements PaymentMethod {
    public void tapToPay(double amount) {

    }

    @Override
    public void pay(double amount) {
        //Specific logic for Apple-Pay
    }
}
