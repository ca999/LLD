package ATM;

public interface AtmState {
    void insertCard(Atm atm, String cardNumber);
    void enterPin(Atm atm, String pin);
    void selectOperation(Atm atm, OperationType op, int... args);
    void ejectCard(Atm atm);
}
