package com.finalexam;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

import org.junit.jupiter.api.Test;

public class PaymentTest {
        
        @Test
        void testDeadline() {
                Payment payment = new Payment(1, PaymentType.MOBILE_MONEY, 216000.0, Instant.now().plusSeconds(3600));
                payment.setDeadline(Instant.now());
                assertEquals(Instant.now(), payment.getDeadline());
        }
        @Test
        void testSetAmount() {
                Payment payment = new Payment(1, PaymentType.BANK_CARD, 350000.0, Instant.now().plusSeconds(14400));
                payment.setAmount(350000.0);
                assertEquals(350000.0, payment.getAmount());
        }
}