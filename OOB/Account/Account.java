package OOB.Account;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private Transaction[] transactions;
    private List<Transaction> transactionsList = new ArrayList<>();

    Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        Transaction sendTransaction = new Transaction(this, accountTo, moneyAmount,
                StandardAccountOperations.MONEY_TRANSFER_SEND);
        Transaction receiveTransaction = new Transaction(this, accountTo, moneyAmount,
                StandardAccountOperations.MONEY_TRANSFER_RECEIVE);

        transactionsList.add(sendTransaction);
        transactions = accountTo.transactionsList.toArray(new Transaction[accountTo.transactionsList.size()]);

        accountTo.transactionsList.add(receiveTransaction);
        accountTo.transactions = accountTo.transactionsList.toArray(new Transaction[accountTo.transactionsList.size()]);
    }

    public void withdrawMoney(double moneyAmount) {
        Transaction withdrawTransaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
        transactionsList.add(withdrawTransaction);
        transactions = transactionsList.toArray(new Transaction[transactionsList.size()]);
    }

    public Transaction[] getTransactions() {
        System.out.println("++++++++ACCOUNT " + getId() + "+++++++++\n");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("++++++++END++++++++++\n");
        return transactions;
    }

    @Override
    public String toString() {
        return "Account no. " + getId();
    }

    private class Transaction {
        private Account accountFrom;
        private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;

        Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation = operation;
        }

        @Override
        public String toString() {
            String toAccount = (accountTo != null) ? ("To: " + accountTo) : "To: N/A";
            return "From: " + accountFrom + "\n" + toAccount + "\n" + "Amount: " + moneyAmount + "\n"
                    + "Operation: " + operation + "\n============\n";
        }

    }

    private enum StandardAccountOperations {
        MONEY_TRANSFER_SEND, MONEY_TRANSFER_RECEIVE, WITHDRAW;
    }
}
