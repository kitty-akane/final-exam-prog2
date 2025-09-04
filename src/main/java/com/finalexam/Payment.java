package com.finalexam;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Setter

public class Payment extends Fees {
        private int id;
        private PaymentType paymentType;
        private double amount;
        private Instant deadline;
}

        public void setAmount(double amount) {
                if (amount < 0) {
                        throw new IllegalArgumentException("Amount shouldn't be negative");
                }
                this.amount = amount;
        }

public void deadline(Instant deadline) {
        if (deadline.isBefore(Instant.now())) {
                throw new IllegalArgumentException("Deadline error");
        } else if (deadline == Instant.now() && amount == payedAmount) {
                throw new Error("fees paid");
        } else if (amount <= payedAmount) {
                throw new Error("still missing some digits");
        } else if (deadline.isAfter(Instant.now()) && amount != payedAmount) {
                throw new Error("still not payed");
        } else if (amount >= payedAmount) {
                throw new Error("payment overpaid");
        } else if (deadline == Instant.now() && amount != payedAmount) {
                throw new Error("late payment");
        }
        this.deadline = deadline;
}
