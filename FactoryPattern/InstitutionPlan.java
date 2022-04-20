package FactoryPattern;

public class InstitutionPlan extends Plan{
    InstitutionPlan(){
        System.out.println("In InstitutionPlan");
    }
    @Override
    public void getRate() {
        rate = 2.90;
    }
}
