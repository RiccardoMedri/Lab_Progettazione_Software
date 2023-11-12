package it.unibo.bank.impl;

import it.unibo.bank.api.AccountHolder;

public class StrictBankAccount extends SimpleBankAccount {            //eredita tutti i metodi e campi di Simple

    private static final double TRANSACTION_FEE = 0.1;

    public StrictBankAccount(final AccountHolder accountHolder, final double balance) {     //costruttore identico a SimpleBank    
        super(accountHolder, balance);
    }

    public void chargeManagementFees(final int usrID) {               //calcola l'ammontare del costo di gestione del conto sommando la tariffa base di gestione al prodotto fra numero di transazioni per costo di singola transazione
        final double feeAmount = SimpleBankAccount.MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {       //controlla che id corrisponda e che sia ammesso il prelievo
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }

    //non ci vorrebbe un override qui??
    public void withdraw(final int usrID, final double amount) {      //riscritto rispetto a SimpleBankAccount perché va controllata se ci siano abbastanza soldi sul conto
        if (isWithdrawAllowed(amount)) {
            super.withdraw(usrID, amount);                            //qui viene richiamto il "vecchio" withdraw
        }
    }

    protected boolean isWithdrawAllowed(final double amount) {        //controlla che ci siano abbastanza soldi nel conto
        return getBalance() > amount;
    }

}
