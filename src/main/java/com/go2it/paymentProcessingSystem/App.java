package com.go2it.paymentProcessingSystem;

import com.go2it.paymentProcessingSystem.entitiy.Payment;
import com.go2it.paymentProcessingSystem.service.IPaymentProcessorService;
import com.go2it.paymentProcessingSystem.validator.IPaymentValidatorService;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class App {
    @Inject
    IPaymentProcessorService paymentProcessorService = null;
    @Inject
    IPaymentValidatorService paymentValidatorService = null;


    public void  start (Payment payment){
        if(paymentValidatorService.validatePayment (payment)){
            paymentProcessorService.PaymentProcessing (payment);
        }
    }


}
