package Polymorphism;

class RBI {

    void newRules() {
        System.out.println("RBI Rule No 1");
    }

    void newRules(String rule) {
        System.out.println(rule);
    }
}

class SBI extends RBI {
    @Override
    void newRules() {
        System.out.println("SBI follow rule");
    }

    @Override
    void newRules(String rule) {
        System.out.println("SBI not follow Rule No 2");
    }
}

public class StaticBindingVsDynamicBinding {

    public static void main(String[] args) {

        // Overloading resolution happens at compile time (static binding)
//        // Overridden method implementation is selected at runtime (dynamic binding)
        RBI ob = new RBI(); // static binding
        ob.newRules();
        ob.newRules("RBI Rule No 2");

        RBI ob2 = new SBI(); // both static and dynamic binding at same time
        ob2.newRules();
        ob2.newRules("");

        SBI ob3 = new SBI();// dynamic binding
        ob3.newRules();
        ob3.newRules("");
    }
}
