package com.administration;

public class SavingAccount extends Account implements IRate {
    public SavingAccount(String name,int socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,1,initialDeposit);
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void transfer() {

    }

    @Override
    public void showinfo() {

    }
}
