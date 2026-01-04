package com.bank.model;

public class CurrentAccount extends Account{

    private double overdraftLimit = 5000;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance + overdraftLimit){
            System.out.println("Overdraft limit exceeded");
        }else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }
    
}
