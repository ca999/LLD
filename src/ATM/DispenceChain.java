package ATM;

public interface DispenceChain {
    void setNextChain(DispenceChain nextChain);
    void dispense(int amount);
    boolean canDispense(int amount);
}
