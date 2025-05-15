public class bank {
    public static void main(String[] args) {
        Bankaccount boc = new BOCaccount(1000);
        boc.deposit(200);
        boc.withdraw(100);
        boc.transferamount();
        System.out.println("BOC Final Balance: " + boc.getBalance());

        Bankaccount peoples = new PEOPLESaccount(2000);
        peoples.deposit(500);
        peoples.withdraw(300);
        peoples.transferamount();
        System.out.println("PEOPLES Final Balance: " + peoples.getBalance());
    }
}
