package com.administration;

public class SavingAccount extends Account implements IRate {
    private int safetyDepositBoxNumber;
    private int safetyDepositBoxCode;
    private double savingRate;
    public SavingAccount(String name,String socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,initialDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBox();
        this.savingRate=setRate();
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxNumber= ((int)(Math.random()*Math.pow(10,3)));
        safetyDepositBoxCode=(int) (Math.random()*Math.pow(10,4));

    }
    @Override
    public double setRate() {
        return baseRate-0.25;
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
        System.out.println("account type: Saving Account"+"\n"+
                "account number "+accountNumber+
                "\ninterest rate: "+df2.format(savingRate));
    }

//    @Override
//    public String toString() {
//        return "Name:"+name+"accountNumber"+accountNumber+"\n"+
//                "deposit:"+initialDeposit;
//    }
}
