package com.inheritance.hirarchical;

public class Bank {
    double bankBalance;

    void calculateInterest(){

    }

    void deposit(double amount){
        if(amount > 0){
            bankBalance += amount;
            System.out.println("Deposit successfull: " + bankBalance);
        }

    }

    void withdrow(){

    }
}
