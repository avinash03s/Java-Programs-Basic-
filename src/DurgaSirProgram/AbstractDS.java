package DurgaSirProgram;

abstract class Vehicle{
    abstract int noOfTiers();
}
class Bus extends Vehicle{
    @Override
    int noOfTiers() {
        System.out.println("Bus have 4 Tiers");
        return 7;
    }
}
class Auto extends Vehicle{
    @Override
    int noOfTiers() {
        System.out.println("Auto tiers is 3");
        return 3;
    }
}

public class AbstractDS {
    public static void main(String[] args) {
        Bus ob= new Bus();
        ob.noOfTiers();
        Auto obj= new Auto();
        obj.noOfTiers();

    }

}
