public class PEOPLESaccount extends Bankaccount {

    public PEOPLESaccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public void transferamount() {
        double transfer = balance * 0.15;
        balance -= transfer;
        System.out.println("PEOPLES transferred: " + transfer);
    }
}