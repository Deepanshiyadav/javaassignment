package FactoryPattern;

public class DomesticPlan extends Plan {

    DomesticPlan(){
        System.out.println("DomesticPlan");
    }

    @Override
    public void getRate() {
        rate = 1.5;
    }
}
