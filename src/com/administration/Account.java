package com.administration;

import java.text.DecimalFormat;

public abstract class Account {
    private static int uniqueNumber=100000;
    private String name;
    private String socialSecurityNumber;
    private int initialDeposit;
    protected String accountNumber;
    protected double interestRate;
    protected double balance;
    protected DecimalFormat df2 = new DecimalFormat("#.##");

    public Account(String name, String socialSecurityNumber,int initialDeposit){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.initialDeposit= initialDeposit;
        this.balance=initialDeposit;
        interestRate=setRate();
        this.accountNumber= generateAccountNumber();
        uniqueNumber ++;
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
        sb.append(socialSecurityNumber.substring(socialSecurityNumber.length()-2));

        //  unique  5-digit number,
        sb.append(uniqueNumber);
        //  and random 3-digit number)
        int randomDigits= (int) (Math.random()*1000);
        sb.append(randomDigits);

        return sb.toString();

    }
    // interest rate of subclasses will call the baseRate from the interface IRate
    public abstract double setRate();

    public void  deposit(double amount){
        balance =balance+amount;
        printBalance();
    }
    public void withdraw(double amount){
        balance=balance-amount;
        printBalance();
    }
    public void printBalance(){
        System.out.println("The balance of your account: "+
               df2.format(balance) );
    }
    public void compound(){
        balance=balance*(1+ interestRate/100);
    }
    public void transfer(Account toAccount, double amount){
        this.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("you have transfered "+amount+" to the account "+toAccount.accountNumber+"" +
                " successfully!");
    }
    public void showinfo(){
        System.out.println("Name:"+name);
        //printBalance();
    }

}
