package InheritanceinJava;

public class Ques_22_Vehicles {

    public void fuelAmount() {
        System.out.println("fuleAmount method ");
    }

    public void capacity() {
        System.out.println("capacity method ");
    }

    public void applyBreaks() {
        System.out.println("applyBreaks method ");
    }

    public static class Bus extends Ques_22_Vehicles {
        public void fuelAmount() {
            System.out.println("In fuelAmount from Bus_class");
        }

        public void capacity() {
            System.out.println("In capacity from Bus_class");
        }

        public void applyBrakes() {
            System.out.println("In applyBrakes from Bus_class");
        }
    }

    public static class Truck extends Ques_22_Vehicles {
        public void fuelAmount() {
            System.out.println("In fuelAmount from Truck_class");
        }

        public void capacity() {
            System.out.println("In capacity from Truck_class");
        }

        public void applyBrakes() {
            System.out.println("In applyBrakes from Truck_class");
        }

    }

    public static class Car extends Ques_22_Vehicles {
        public void fuelAmount() {
            System.out.println("In fuelAmount from Car_class");
        }

        public void capacity() {
            System.out.println("In capacity from Car_class");
        }

        public void applyBrakes() {
            System.out.println("In applyBrakes from Car_class");
        }
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Car c = new Car();
        c.applyBrakes();
        c.capacity();
        c.fuelAmount();
        System.out.println("------------------------------------");
        Bus b= new Bus();
        b.applyBrakes();
        b.capacity();
        b.fuelAmount();
        System.out.println("------------------------------------");
        Truck t = new Truck();
        t.applyBrakes();
        t.capacity();
        t.fuelAmount();
        System.out.println("------------------------------------");


    }


}
