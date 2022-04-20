package FactoryPattern;

public class CommercialPlan extends Plan{
    CommercialPlan(){
        System.out.println("In CommercialPlan");
    }

    @Override
    public void getRate() {
        rate = 3.90;
    }
}
