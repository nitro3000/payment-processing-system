package com.go2it.paymentProcessingSystem.entitiy;

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private String clientName;
    private LocalDate date;
    private double sum;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Payment(int paymentId, String clientName, LocalDate date, double sum) {
        this.paymentId = paymentId;
        this.clientName = clientName;
        this.date = date;
        this.sum = sum;
    }
}
