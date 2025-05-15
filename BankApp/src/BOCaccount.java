public class BOCaccount extends Bankaccount {

    public BOCaccount(double balance) {
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
        double transfer = balance * 0.10;
        balance -= transfer;
        System.out.println("BOC transferred: " + transfer);
    }
}