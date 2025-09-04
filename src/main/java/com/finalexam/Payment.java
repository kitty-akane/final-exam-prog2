package com.finalexam;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Payment extends Fees {
        private int id;
        private PaymentType paymentType;
        private double amount;
        private Instant deadline;
}

public void setDeadline(Instant deadline, PaymentType paymentType){
        if(deadline.isBefore(Instant.now())){
                throw new IllegalArgumentException("Deadline error");
        } else if(deadline == Instant.now() && amount == payedAmount){
                throw new Error("fees paid");
        } else if (amount <= payedAmount) {
                throw new Error("still missing some digits");
        } else if(deadline.isAfter(Instant.now()) && amount != payedAmount){
                throw new Error("still not payed");
        } else if (amount >= payedAmount) {
                throw new Error("payment overpaid");
        } else if(deadline == Instant.now() && amount != payedAmount){
                throw new Error("late payment");
        }
}