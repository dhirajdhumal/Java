package com.polymorphism.runtimepolymorphism;

public class UPIPayment extends Payment{
    @Override      //Annotation  -> it shows extra information
    void pay(){
        super.pay();  //if we want we get if we dont want we didnt
        System.out.println("Pay using UPI");
    }

    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.pay();
    }
}
