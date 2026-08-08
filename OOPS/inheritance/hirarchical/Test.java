package com.inheritance.hirarchical;

public class Test {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.calculateInterest();
        System.out.println(sbi.bankBalance);
        sbi.deposit(10000);

        HDFC hdfc = new HDFC();
        hdfc.calculateInterest();
        System.out.println(hdfc.bankBalance);
        sbi.deposit(1000);

        AXIS axis = new AXIS();
        axis.calculateInterest();
        System.out.println(axis.bankBalance);
        axis.deposit(200);
    }
}
