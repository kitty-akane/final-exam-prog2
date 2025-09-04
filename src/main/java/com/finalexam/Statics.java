package com.finalexam;

import java.time.Instant;
import java.util.List;

public class Statics extends Fees {
        public Statics(int id, String label, double amountToPay, double payedAmount, Instant payedAt) {
                super(id, label, amountToPay, payedAmount, payedAt);
        }

        public static double getLateFees(List<Fees> feesList, Instant t) {
                return feesList.stream()
                                .filter(fee -> fee.getPayedAt() != null && fee.getPayedAt().isAfter(t))
                                .mapToDouble(Fees::getAmountToPay)
                                .sum();
        }

        public static double getTotalMissingFees(List<Fees> feesList, Instant t) {
                return feesList.stream()
                                .filter(fee -> fee.getPayedAt() == null || fee.getPayedAt().isBefore(t))
                                .mapToDouble(Fees::getAmountToPay)
                                .sum();
        }
        public static double getTotalPaidByStudent(Student student, List<Fees> feesList, Instant t) {
                return feesList.stream()
                                .filter(fee -> fee.getPayedAt() != null) && fee.getPayedAt(.isBefore(t))
                                .mapToDouble(Fees::getAmountToPay)
                                .sum();
        }
}
