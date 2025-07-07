package ATM;

public class NoteDispencer implements DispenceChain{
    DispenceChain nextChain;
    int numberOfNotes;
    int noteValue;

    NoteDispencer(int numberOfNotes, int noteValue){
        this.numberOfNotes = numberOfNotes;
        this.noteValue = noteValue;
    }

    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public synchronized void dispense(int amount) {
         if(amount >= noteValue) {
             int numToDispense = Math.min(amount / noteValue, this.numberOfNotes);
             int remainingAmount = amount - (numToDispense * noteValue);

             if (numToDispense > 0) {
                 System.out.println("Dispensing " + numToDispense + " x $" + noteValue + " note(s)");
                 this.numberOfNotes -= numToDispense;
             }

             if (remainingAmount > 0 && this.nextChain != null) {
                 this.nextChain.dispense(remainingAmount);
             }
         } else if (this.nextChain != null) {
             this.nextChain.dispense(amount);
         }
    }

    @Override
    public synchronized boolean canDispense(int amount) {
        if (amount < 0) return false;
        if (amount == 0) return true;

        int numToUse = Math.min(amount / noteValue, this.numberOfNotes);
        int remainingAmount = amount - (numToUse * noteValue);

        if (remainingAmount == 0) return true;
        if (this.nextChain != null) {
            return this.nextChain.canDispense(remainingAmount);
        }
        return false;
    }
}
