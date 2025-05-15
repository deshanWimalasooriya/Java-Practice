public abstract class Bankaccount implements Transaction {
    protected double balance;

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void transferamount();
}