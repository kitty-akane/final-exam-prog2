package com.finalexam;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Fees {
        private int id;
        private String label;
        private double amountToPay;
        protected double payedAmount;
        protected Instant payedAt;
}
