package com.go2it.paymentProcessingSystem.validator;

import com.go2it.paymentProcessingSystem.entitiy.Payment;

public interface IPaymentValidatorService {

    boolean validatePayment(Payment payment);

}
