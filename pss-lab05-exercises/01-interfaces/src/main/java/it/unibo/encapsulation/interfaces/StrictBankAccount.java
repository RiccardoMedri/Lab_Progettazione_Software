package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private final int id;
    private double balance;
    private int transactions = 0;
    private static double ATM_TRANSACTION_FEE = 1;

    public StrictBankAccount (final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        
        if (this.id == id) {
            this.transactions += 1;
            this.balance += amount;
        }
    }

    public void withdraw (final int id, final double amount) {

        if (this.id == id) {
            if (this.balance <= amount) {
                this.transactions += 1;
                this.balance -= amount; 
            }
        }        
    }

    public void depositFromATM(final int id, final double amount) {

        if (this.id == id) {
            this.transactions += 1;
            this.balance += (amount - StrictBankAccount.ATM_TRANSACTION_FEE);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {

        if (this.id == id) {
            if (this.balance <= amount) {
                this.transactions += 1;
                this.balance -= (amount + StrictBankAccount.ATM_TRANSACTION_FEE); 
            }           
        }
    }

    public void chargeManagementFees(final int id) {
        
        if (this.id == id) {
            double managementFees = ((this.transactions * 0.1) + 5); 
            this.balance -= managementFees;
        }
    }



}
