package com.administration;

import java.util.ArrayList;
import java.util.List;

public class BankaccountApp {

    public static void main(String[] args) {
        //List<Account> bankAccounts= new ArrayList<>();
        // Read in from csv file
        SavingAccount acc1= new SavingAccount("Tina","2342346294",1000);
        acc1.showinfo();
        CheckingAccount acc2= new CheckingAccount("alisa","23422476324",1000);
        acc2.showinfo();
    }
}
