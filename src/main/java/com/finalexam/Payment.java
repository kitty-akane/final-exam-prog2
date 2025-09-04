package com.finalexam;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Payment extends PaymentMode {
        private int id;
        private String label;
        private PaymentType PaymentType;
        private double amount;
        private Instant deadline;
}

public void setDeadline(Instant deadline, PaymentType paymentType){
        if(deadline.isBefore(Instant.now())){
                throw new IllegalArgumentException("Deadline error");
        } else if(deadline == Instant.now() && amount == payedAmount){
                throw new Error("payement in progress");
        } else if (amount <= payedAmount) {

        } else if(deadline.isAfter(Instant.now()) && amount != payedAmount){
                throw new Error("still not payed");
        } else if (amount >= payedAmount) {
                throw new Error("payment overpaid");
        }
}