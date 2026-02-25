package java_9_feature;

@FunctionalInterface
interface PrivateMethodContain {

    private void privateMethod() {
        System.out.println("this is our private method");
    }

    private static void privateStaticMethod() {
        System.out.println("this is our private static method");
    }

    static void staticMethod() {
        System.out.println("this is static method");
        privateStaticMethod();
    }

    default void defaultMethod() {
        System.out.println("this is default method");
        privateMethod();
    }

    void abstractMethod();
}

public class PrivateMethod {

    public static void main(String[] args) {
        PrivateMethodContain privateMethodContain = () -> System.out.println("this is abstract method");
        privateMethodContain.abstractMethod();
        privateMethodContain.defaultMethod();
        PrivateMethodContain.staticMethod();
    }
}

///conclusion : why introduce private method and private static method ?
/// because : in our interface contain common code in multiple method this code put in private method
/// and private method and private static method call within default method, but private static method call only within
/// static method;