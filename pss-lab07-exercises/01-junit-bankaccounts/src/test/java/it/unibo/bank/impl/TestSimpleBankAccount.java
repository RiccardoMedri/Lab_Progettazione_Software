package it.unibo.bank.impl; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import it.unibo.bank.api.AccountHolder;
import it.unibo.bank.api.BankAccount;

public class TestSimpleBankAccount {

    private AccountHolder aRossi;
    private AccountHolder aBianchi;

    @BeforeEach
    public void setUp() {      //viene eseguito prima di ogni test case
        
        this.aRossi = new AccountHolder("Andrea", "Rossi", 1);
        this.aBianchi = new AccountHolder("Alex", "Bianchi", 2);
    }

    @Test
    public void testNewSimpleBankAccount() {             //metodo di test per la corretta crezione di un SimpleBankAccount
        
        BankAccount account = new SimpleBankAccount(aRossi, 0.0);  //uso del costruttore della classe da testare
        Assertions.assertEquals(0.0, account.getBalance());                //test per verificare che il conto sia a zero
        Assertions.assertEquals(0, account.getTransactionsCount());        //test per verificare che contatore transazioni sia a zero
        Assertions.assertSame(this.aRossi, account.getAccountHolder());    //test per verificare che intestatario sia Rossi
    }
    
    @Test
    public void testChargeManagementFees() {

        BankAccount account = new SimpleBankAccount(aRossi, 55.0);
        account.chargeManagementFees(aRossi.getUserID());                   //classe di SimpleBankAccount da testare
        Assertions.assertEquals(50, account.getBalance());                  //test per verificare che il conto ritorni corretto
        Assertions.assertEquals(0, account.getTransactionsCount());         //test per verificare che il contatore transazioni sia a zero
    }

    /* @test
    public void testDeposit() {                                             //forse non necessario testando il metodo DepositFromATM che implementa deposit

        BankAccount account = new SimpleBankAccount(aRossi, 0.0);
        account.deposit(aRossi.getUserID(), 30);                            //classe di SimpleBankAccount da testare
        Assertions.assertEquals(30.0, account.getBalance());                //test per verificare che il conto ritorni corretto
        Assertions.assertEquals(1, account.getTransactionsCount());         //test per verificare che il contatore transazioni sia a uno
    } */

    @Test
    public void testDepositFromATM() {

        BankAccount account = new SimpleBankAccount(aRossi, 0.0);
        account.depositFromATM(aRossi.getUserID(), 30);
        Assertions.assertEquals(29, account.getBalance());
        Assertions.assertEquals(1, account.getTransactionsCount());
    }

    @Test
    public void testWithdrawFromAtm() {

        BankAccount account = new SimpleBankAccount(aRossi, 50.0);
        account.withdrawFromATM(aRossi.getUserID(), 30.0);
        Assertions.assertEquals(19.0, account.getBalance());
        Assertions.assertEquals(1, account.getTransactionsCount());
    }
}
