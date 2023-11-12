package it.unibo.bank.impl; 

import it.unibo.bank.api.AccountHolder;
import it.unibo.bank.api.BankAccount;

public class SimpleBankAccount implements BankAccount {

    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public SimpleBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    public void chargeManagementFees(final int id) {              //deduce le spese di gestione e azzera il contatore transazioni

        if (checkUser(id)) {
            
            this.balance -= SimpleBankAccount.MANAGEMENT_FEE;
            resetTransactions();
        }
    }

    public void deposit(final int id, final double amount) {              //aggiunge il deposito e aumenta di uno il contatore transazioni

        this.transactionOp(id, amount);
    }

    public void depositFromATM(final int id, final double amount) {          //stessa cosa di deposit ma sottrae al deposito il costo della ATM

        this.deposit(id, amount - SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    @Override
    public AccountHolder getAccountHolder() {               //perché override? non è un semplice completamento del metodo della interfaccia?
        
        return holder;
    }

    public double getBalance() {                            //resistuisce il bilancio del conto
        
        return this.balance;
    }

    protected void setBalance(final double balance) {       //imposta il bilancio del conto
        
        this.balance = balance;
    }

    public int getTransactionsCount() {                     //restituisce il numero di transazioni effettuate
        
        return this.transactions;
    }

    public void withdraw(final int id, final double amount) {          //incrementa il numero transazioni e rimuove la cifra dal conto, il conto può andare in negativo
 
        this.transactionOp(id, -amount);
    }

    public void withdrawFromATM(final int id, final double amount) {        //incrementa il numero di transazioni e rimuove la cifra + spese ATM dal conto, il conto può andare in rosso

        this.withdraw(id, amount + SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {                 //restituisce l'id dell'AccountHolder restituito da getAccountHolder
        
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {                    //incrementa contatore di transazioni

        this.transactions++;
    }

    protected void resetTransactions() {                        //resetta contatore transazioni

        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {           //aggiunge la cifra e aumenta di uno il contatore transazioni
        
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }
}
