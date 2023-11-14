package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.BankAccount;
import it.unibo.inheritance.api.AccountHolder; 

public class AbstractBankAccount implements BankAccount {
    
    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions; 

    public AbstractBankAccount(final AccountHolder accountHolder, final double balance) {

    }

    public void chargeManagementFees(final int id) {

    }

    public void deposit(int id, double amount) {

    }

    public void depositFromATM(int id, double amount) {

    }

    public AccountHolder getAccountHolder() {

    }

    public double getBalance()

    public int getTransactionsCount();

    public void withdraw(int id, double amount);

    public void withdrawFromATM(int id, double amount);
}
