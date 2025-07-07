package CarRental;

public class CreditCardPaymentGateway implements PaymentGateway {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " to CreditCard");
        return true;
    }
}
