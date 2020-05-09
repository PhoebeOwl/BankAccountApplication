package com.administration;

import java.text.DecimalFormat;

public class CheckingAccount extends Account implements IRate{
    private long debitCardNumber;
    private int debitCardCode;
    private double checkingRate;


    public CheckingAccount(String name,String socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,initialDeposit);
        accountNumber="2"+accountNumber;
        setDebitCardBox();
        this.checkingRate=setRate();

    }
    private void setDebitCardBox(){
        debitCardNumber= ((long)(Math.random()*Math.pow(10,12)));
        debitCardCode=((int) (Math.random()*Math.pow(10,4)));

    }

    @Override
    public double setRate() {
        return baseRate*0.15;
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
        super.showinfo();
        System.out.println("account type: checking Account"+"\n"+
                "account number"+accountNumber+
                "\ninterest rate: "+df2.format(checkingRate));
    }
//    @Override
//    public String toString() {
//        return "Name:"+name+"accountNumber"+accountNumber+"\n"+
//                "deposit:"+initialDeposit;
//    }
}
