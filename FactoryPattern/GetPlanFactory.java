package FactoryPattern;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }else if(planType.equalsIgnoreCase("commerical")) {
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("industrial")){
            return new InstitutionPlan();
        }else
            return null;
    }
}