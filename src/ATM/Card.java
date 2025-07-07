package ATM;

public class Card {
    private final String cardNumber;
    private String cardPin;

    Card(String cardNumber, String cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardPin() {
        return cardPin;
    }

}
