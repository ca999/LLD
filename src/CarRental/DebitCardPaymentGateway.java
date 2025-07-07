package CarRental;

public class DebitCardPaymentGateway implements PaymentGateway {

    @Override
    public boolean pay(double amount) {
        System.out.println("Paying " + amount + " to Debit Card");
        return true;
    }
}
