package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    
    private static final double TRANSACTION_FEE = 0.1;

    //NON DOVREMMO AGGIUNGERE ANCHE QUESTI CAMPI IN QUANTO PRIVATI IN SIMPLE?
    /*private final int id;
    private double balance;
    private int transactions;*/

    //perché cambio id? perchè è final in Simple? e perchè non balance?
    public ExtendedStrictBankAccount(final int usrID, final double balance) {
        super(usrID, balance);
    }

    //non abbiamo bisogno di transactionOp
    //incrementTransaction ereditato
    //deposit ereditato

    @Override //da modificare rispetto a Simple per mancanza di isWithdrawAllowed
    public void withdraw(final int usrID, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(usrID, -amount);
        }
    }

    //aggiunto perchP mancante in Simple
    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }

    //depositFromATM ereditato
    //withdrawFromATm ereditato
    //incrementTransaction ereditato
    //getBalance ereditato
    //getTransactionCount ereditato

    public void chargeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }

    //checkUser ereditato
}
