package com.bankaccountApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankaccountApp {

    public static void main(String[] args) {
        //List<Account> bankAccounts= new ArrayList<>();
        // Read in from csv file
        List<Account> accountHolder= new ArrayList<>();
        List<String[]> customerInfo= new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader("F:\\learnJava\\chanllengeFiles\\customers.csv"));
            Scanner sc=new Scanner(br);
            while(sc.hasNextLine()){
                String dataRow= sc.nextLine();
                System.out.println(dataRow);
                String[] dataRecords= dataRow.split(",");
                customerInfo.add(dataRecords);
            }
            sc.close();
        }catch (FileNotFoundException e){

        }catch(IOException e){

        }
        for (String[] customer : customerInfo){
            if(customer[2].equals("Savings")){
                SavingAccount sacc= new SavingAccount(customer[0],customer[1],Integer.parseInt(customer[3]));
                accountHolder.add(sacc);
                System.out.println("saving account added");
            }else{
                CheckingAccount cacc=new CheckingAccount(customer[0],customer[1],Integer.parseInt(customer[3]));
                accountHolder.add(cacc);
                System.out.println("checking account added");
            }
        }
        for (Account acc : accountHolder){
            acc.showinfo();
        }
        // SavingAccount acc1= new SavingAccount("Tina","2342346294",1000);
//        acc1.compound();
//        acc1.showinfo();
//        CheckingAccount acc2= new CheckingAccount("alisa","23422476324",1000);
//        acc2.compound();
//        acc2.showinfo();
    }
}
