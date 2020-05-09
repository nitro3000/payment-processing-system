package com.go2it.paymentProcessingSystem.service;

import com.go2it.paymentProcessingSystem.entitiy.Payment;

import javax.inject.Named;

@Named
public class PaymentProcessorService implements IPaymentProcessorService{

public  PaymentProcessorService(){
}
@Override
public void PaymentProcessing(Payment payment){
    System.out.println ("Payment is processed" );
    //return false;
}
//public boolean PaymentProcessing(Payment payment) { return false;}
}
