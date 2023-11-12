package it.unibo.bank.impl; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import it.unibo.bank.api.AccountHolder;
import it.unibo.bank.api.BankAccount;
import it.unibo.bank.impl.TestSimpleBankAccount;

public class TestStrictBankAccount extends TestSimpleBankAccount {

    private AccountHolder aBianchi;

    @BeforeEach
    public void setUp() {      //viene eseguito prima di ogni test case

        this.aBianchi = new AccountHolder("Alex", "Bianchi", 1);
    }
}