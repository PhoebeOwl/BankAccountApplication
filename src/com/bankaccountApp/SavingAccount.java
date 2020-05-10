package com.bankaccountApp;

public class SavingAccount extends Account implements IRate {
    private int safetyDepositBoxNumber;
    private int safetyDepositBoxCode;

    public SavingAccount(String name,String socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,initialDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBox();

    }
    private void setSafetyDepositBox(){
        safetyDepositBoxNumber= ((int)(Math.random()*Math.pow(10,3)));
        safetyDepositBoxCode=(int) (Math.random()*Math.pow(10,4));

    }
    @Override
    public double setRate() {
        return getBaseRate() -0.25;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("account type: Saving Account"+"\n"+
                "account number: "+accountNumber+
                "\ninterest rate: "+df2.format(interestRate) +
                "\nYour saving account features: \n  safety deposit box Number:"+safetyDepositBoxNumber +
                "\n  safety deposit box code:"+safetyDepositBoxCode +
                "\n***********************");
    }

//    @Override
//    public String toString() {
//        return "Name:"+name+"accountNumber"+accountNumber+"\n"+
//                "deposit:"+initialDeposit;
//    }
}
