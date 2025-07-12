package part2_2;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);

    default void printDetailedBill(String patientId, double amount) {
        System.out.println(formatDetailedBill(patientId, amount));
    }

    private String formatDetailedBill(String patientId, double amount) {
        return "Hospital Bill for Patient " + patientId + ": " + amount + " processed.";
    }

    static boolean validateInsuranceId(String insuranceId) {
        return insuranceId.length() == 10;
    }

    static boolean validatedPatientId(String patientId) {
        return patientId.startsWith("HSP") && patientId.length() == 8;
    }
}
