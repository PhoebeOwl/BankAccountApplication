package com.administration;

public class CheckingAccount extends Account implements IRate{
    public CheckingAccount(String name,int socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,2,initialDeposit);

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
