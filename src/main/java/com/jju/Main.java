package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("4321-8765-2109-6543"));
        payments.add(new PayPal("berekettsegayefantaye@gmail.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}