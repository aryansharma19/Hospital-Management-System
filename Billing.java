package src;

public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic
        Double amountPaidByInsuranceCompany = 0.0;
        Double discount = 0.0;
        if(patientInsurancePlan != null) {
             amountPaidByInsuranceCompany = patientInsurancePlan.getCoverage() * amount;
             discount = 0.0;
            if (patientInsurancePlan instanceof PlatinumPlan) {
                discount = 50.0;
            } else if (patientInsurancePlan instanceof GoldPlan) {
                discount = 40.0;
            } else if (patientInsurancePlan instanceof SilverPlan) {
                discount = 30.0;
            } else if (patientInsurancePlan instanceof BronzePlan) {
                discount = 25.0;
            }
        }
        else{
             amountPaidByInsuranceCompany = 0.0;
             discount = 20.0;
        }
        Double amountPaidByPatient = amount - (amountPaidByInsuranceCompany + discount);
        payments[0]= amountPaidByInsuranceCompany;
        payments[1] = amountPaidByPatient;
        return payments;
    }

}
