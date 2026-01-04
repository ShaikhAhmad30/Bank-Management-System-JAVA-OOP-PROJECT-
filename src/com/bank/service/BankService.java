package com.bank.service;

import java.util.ArrayList;

import com.bank.model.*;



public class BankService {
    
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(Account acc){
        accounts.add(acc);
        System.out.println("Account created successfully!");

    }
    
    public Account findAccount(int accNo){

        for(Account acc : accounts){
            if(acc.getAccountNumber() == accNo){
                return acc;
            }
        }
        return null;
    }
}
