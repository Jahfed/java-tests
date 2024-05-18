package OOB.Account;

public class TransactionDemo {
    public static void main(String[] args) {
        Account account1 = new Account(1);
        Account account2 = new Account(2);

        account1.sendMoneyToAccount(account2, 100);
        account2.sendMoneyToAccount(account1, 25);
        account1.withdrawMoney(200);
        account2.withdrawMoney(25);

        account1.getTransactions();
        account2.getTransactions();
    }
}
