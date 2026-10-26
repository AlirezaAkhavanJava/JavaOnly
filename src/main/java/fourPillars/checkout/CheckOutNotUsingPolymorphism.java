package fourPillars.checkout;

import fourPillars.checkout.paymentMethods.ApplePay;
import fourPillars.checkout.paymentMethods.CreditCard;
import fourPillars.checkout.paymentMethods.PayPal;

public class CheckOutNotUsingPolymorphism {
    public void pay(String method, double amount) {
        switch (method) {
            case "card" -> {
                CreditCard c = new CreditCard();
                c.chargeCard(amount);
            }
            case "paypal" -> {
                PayPal p = new PayPal();
                p.sendPayPal(amount);
            }
            case "applepay" -> {
                ApplePay a = new ApplePay();
                a.tapToPay(amount);
            }
        }
    }
}
