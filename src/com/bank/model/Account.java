package com.bank.model;

public abstract class Account {
        protected int accountNumber;
        protected String holderName;
        protected double balance;

        public Account(int accountNumber, String holderName, double balance){
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }

        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);

        public void showDetails(){
            System.out.println("Account No: "+ accountNumber);
            System.out.println("Holder Name: "+holderName);
            System.out.println("Balance: "+balance);
        }

        public int getAccountNumber(){
            return accountNumber;
        }
    
}
