package src;

public class BlueCrossBlueShield implements InsuranceBrand{

    private long id;
    private String name;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
        double monthlyPremium = 0.0;
        if(insurancePlan instanceof PlatinumPlan){
            if(age>55){
                monthlyPremium = monthlyPremium+ 200;
            }
            if(smoking){
                monthlyPremium = monthlyPremium + 100;
            }
            return monthlyPremium;
        }
        else if(insurancePlan instanceof GoldPlan){
            if(age>55){
                monthlyPremium = monthlyPremium+ 150;
            }
            if(smoking){
                monthlyPremium = monthlyPremium + 90;
            }
            return monthlyPremium;
        }
        else if(insurancePlan instanceof SilverPlan){
            if(age>55){
                monthlyPremium = monthlyPremium+ 100;
            }
            if(smoking){
                monthlyPremium = monthlyPremium + 80;
            }
            return monthlyPremium;
        }
        else if (insurancePlan instanceof BronzePlan){
            if(age>55){
                monthlyPremium = monthlyPremium+ 50;
            }
            if(smoking){
                monthlyPremium = monthlyPremium + 70;
            }
            return monthlyPremium;
        }
        return 0;
    }
}
