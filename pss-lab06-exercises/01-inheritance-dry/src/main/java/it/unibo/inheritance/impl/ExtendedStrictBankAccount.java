package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    
    private static final double TRANSACTION_FEE = 0.1;

    //perché cambio id? perchè è final in Simple? SI' VEDI SLIDE 45 PDF
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
