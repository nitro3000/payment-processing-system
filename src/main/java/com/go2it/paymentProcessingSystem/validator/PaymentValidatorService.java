package com.go2it.paymentProcessingSystem.validator;

import com.go2it.paymentProcessingSystem.App;
import com.go2it.paymentProcessingSystem.entitiy.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class PaymentValidatorService implements IPaymentValidatorService {

    private static final Logger LOGGER = LoggerFactory.getLogger (PaymentValidatorService.class);


    public boolean validatePayment(Payment payment) {

        if ( payment != null){
            System.out.println ("Payment validated." );
            LOGGER.info ("Payment validated, payment ID: "+payment.getPaymentId ());
        }

        return false;
    }
}
