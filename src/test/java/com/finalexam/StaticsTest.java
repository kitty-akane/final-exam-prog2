package com.finalexam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StaticsTest {
        @Test
        void getLateFees() {
                double lateFees = Statics.getLateFees(null, null);
                assertEquals(0.0, lateFees);
        }

        @Test
        void getTotalMissingFees() {
                double getTotalMissingFees = Statics.getTotalMissingFees(null, null);
                assertEquals(0.0, getTotalMissingFees);
        }

        @Test
        void getTotalPaidByStudent() {
                double getTotalPaidByStudent = Statics.getTotalPaidByStudent(null, null);
                assertEquals(0.0, getTotalPaidByStudent);
        }
}
