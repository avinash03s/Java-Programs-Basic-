package Polymorphism.MethodOverloading;

/*Package Number 1 */


public class SuperOverridingRule {
    void set(){
        System.out.println("Default method");
    }

    public void meet(){
        System.out.println("public method");
    }

    protected void get(){
        System.out.println("protected method");
    }
    private void net(){
        System.out.println("private method");
    }

    final void think(){
        System.out.println("final method");
    }
    static void multi(){
        System.out.println("static method");
    }
}
