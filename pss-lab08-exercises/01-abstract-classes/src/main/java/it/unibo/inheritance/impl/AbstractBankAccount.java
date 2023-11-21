package it.unibo.inheritance.impl; 

import it.unibo.inheritance.api.BankAccount;
import it.unibo.inheritance.api.AccountHolder; 

public abstract class AbstractBankAccount implements BankAccount {
    
    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions; 

    protected AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = computeFees();
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            balance -= feeAmount;
            resetTransactions();
        }
    }

    public void deposit(int id, double amount) {
        this.transactionOp(usrID, amount);
    }

    public void depositFromATM(int id, double amount) {
        this.deposit(usrID, amount - ATM_TRANSACTION_FEE);
    }

    public AccountHolder getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return this.balance;
    }

    protected final void setBalance(final double amount) {
        this.balance = amount;
    }

    public int getTransactionsCount() {
        return this.transaction;
    }

    public final void withdraw(final int usrID, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(usrID, -amount);
        }
    }

    public final void withdrawFromATM(final int usrID, final double amount) {
        this.withdraw(usrID, amount + ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {
        return this.holder.getUserID() == id;
    }

    protected abstract double computeFees();

    protected final void incrementTransactions() {
        this.transactions++;
    }

    protected abstract boolean isWithdrawAllowed(double amount);

    protected final void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

}
