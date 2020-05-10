package com.administration;

public class CheckingAccount extends Account implements IRate{
    private long debitCardNumber;
    private int debitCardCode;



    public CheckingAccount(String name,String socialSecurityNumber,int initialDeposit){
        super(name,socialSecurityNumber,initialDeposit);
        accountNumber="2"+accountNumber;
        setDebitCardBox();


    }
    private void setDebitCardBox(){
        debitCardNumber= ((long)(Math.random()*Math.pow(10,12)));
        debitCardCode=((int) (Math.random()*Math.pow(10,4)));

    }

    @Override
    public double setRate() {
        return getBaseRate() *0.15;
    }


    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("account type: checking Account"+"\n"+
                "account number: "+accountNumber+
                "\ninterest rate: "+df2.format(interestRate)+
                "\nYour checking account features: \n  debit card Number:"+debitCardNumber +
                "\n  debit card code:"+debitCardCode +
                "\n***********************");
    }
//    @Override
//    public String toString() {
//        return "Name:"+name+"accountNumber"+accountNumber+"\n"+
//                "deposit:"+initialDeposit;
//    }
}
