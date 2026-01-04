package com.bank.app;

import java.util.Scanner;

import com.bank.model.*;
import com.bank.service.BankService;

public class MainApp {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while(true){
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");


            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Account No: ");
                    int sAcc = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Name: ");
                    String sNAme = sc.nextLine();
                    service.createAccount(new SavingsAccount(sAcc, sNAme, 0));
                    break;
                
                case 2:
                    System.out.println("Account No: ");
                    int cAcc = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Name: ");
                    String cName = sc.nextLine();
                    service.createAccount(new CurrentAccount(cAcc, cName, 0));
                    break;
                
                case 3:
                    System.out.println("Account No: ");
                    int dAcc = sc.nextInt();
                    System.out.println("Amount: ");
                    double dAmt = sc.nextDouble();
                    Account dAccount = service.findAccount(dAcc);
                    if(dAccount != null)
                        dAccount.deposit(dAmt);
                    else
                        System.out.println("Account not Found");
                    break;
                
                case 4:
                    System.out.println("Account No: ");
                    int wAcc = sc.nextInt();
                    System.out.println("Amount: ");
                    double wAmt = sc.nextDouble();
                    Account wAccount = service.findAccount(wAcc);
                    if(wAccount != null)
                        wAccount.withdraw(wAmt);
                    else
                        System.out.println("Account not found");
                    break;

                case 5: 
                    System.out.println("Account No: ");
                    int aNo = sc.nextInt();
                    Account acc = service.findAccount(aNo);
                    if(acc != null)
                        acc.showDetails();
                    else
                        System.out.println("Account not found");
                    break;
            }


        }
    }
}
