package com.administration;

public abstract class Account {
    static int uniqueNumber=100000;
    private String name;
    private int socialSecurityNumber;
    private int accountType;
    private String accountNumber;
    private int initialDeposit;
    public Account(String name, int socialSecurityNumber, int accountType,int initialDeposit){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.initialDeposit= initialDeposit;
        this.accountType=accountType;
        this.accountNumber= generateAccountNumber();
        this.uniqueNumber ++;
    }
    public String generateAccountNumber(){
        //11-Digit Account Number (generated with the following process:
        //  1 or 2 depending on Savings or Checking,
        //  last two digits of SSN,
        //  unique  5-digit number,
        //  and random 3-digit number)
        StringBuilder sb= new StringBuilder(11);
        //  1 or 2 depending on Savings or Checking,
        if(accountType==1){
            sb.append(1);
        }else if (accountType == 2){
            sb.append(2);
        }else{
            System.out.println("accountType not available");
        }
        //  last two digits of SSN,
        int lastTwoSSN = socialSecurityNumber%100;
        sb.append(lastTwoSSN);
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
    public abstract void showinfo();

}
