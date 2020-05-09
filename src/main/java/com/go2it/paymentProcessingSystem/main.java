package com.go2it.paymentProcessingSystem;

import com.go2it.paymentProcessingSystem.entitiy.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

//Create a small payment processing system.It must have:
//a. Payment client that will create a Payment and submit it to the PaymentProcessor
//b. PaymentProcessor has to validate the payment first (using the Validator)
//c. If validation passes, the payment can be persisted. Based on the config in .properties file we can store the data in DB and/or file.
public class main {

    public static void main(String[] args) {
        Payment payment = new Payment (10001, "Stive Jobz", LocalDate.now (),9000);

        ApplicationContext ctx = new ClassPathXmlApplicationContext ("beans.xml");
        App app= (App)ctx.getBean ("app");
        app.start (payment);

    }
}
