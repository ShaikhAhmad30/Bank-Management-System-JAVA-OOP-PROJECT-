package com.bank.model;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance){
            System.out.println("Insufficient balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawal successfully!");
        }
    }

}