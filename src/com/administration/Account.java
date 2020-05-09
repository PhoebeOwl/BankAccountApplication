package com.administration;

import java.text.DecimalFormat;

public abstract class Account {
    static int uniqueNumber=100000;
    String name;
    double baseRate;
    String socialSecurityNumber;
    int accountType;
    String accountNumber;
    int initialDeposit;
    DecimalFormat df2 = new DecimalFormat("#.##");
    public Account(String name, String socialSecurityNumber,int initialDeposit){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.initialDeposit= initialDeposit;
        this.baseRate=0.75;
        this.accountType=accountType;
        this.accountNumber= generateAccountNumber();
        this.uniqueNumber ++;
    }
    public String generateAccountNumber(){
        //11-Digit Account Number (generated with the following process:
        //  1 or 2 depending on Savings or Checking, ---> this move to subclasses
        //  last two digits of SSN,
        //  unique  5-digit number,
        //  and random 3-digit number)
        StringBuilder sb= new StringBuilder(11);
        //  last two digits of SSN,
//        int lastTwoSSN = socialSecurityNumber%100;
//        sb.append(lastTwoSSN);
        sb.append(socialSecurityNumber.substring(socialSecurityNumber.length()-2,socialSecurityNumber.length()));

        //  unique  5-digit number,
        sb.append(uniqueNumber);
        //  and random 3-digit number)
        int randomDigits= (int) (Math.random()*1000);
        sb.append(randomDigits);

        return sb.toString();

    }
    public abstract void  deposit();
    public abstract void withdraw();
    public abstract void transfer();
    public void showinfo(){
        System.out.println("Name:"+name+"\n"+
               "social security number:"+"\n"+
                "initial deposit"+initialDeposit);
    };

}
