package fourPillars.checkout;

public class CheckoutWithPolymorphism {
    public void pay(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
