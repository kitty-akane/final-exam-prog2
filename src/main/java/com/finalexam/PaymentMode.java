package com.finalexam;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PaymentMode {
        protected int id;
        protected double payedAmount;
        protected Instant payedAt;
}
