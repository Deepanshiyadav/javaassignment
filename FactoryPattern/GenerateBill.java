package FactoryPattern;

public class GenerateBill {
    public static void main(String[] args){
        GetPlanFactory planFactory= new GetPlanFactory();

        Plan p = planFactory.getPlan("domestic");
            p.getRate();
            p.calculateBill(23);

    }

}
