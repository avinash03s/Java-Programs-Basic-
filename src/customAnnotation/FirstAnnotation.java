package customAnnotation;


public class FirstAnnotation {

    @Method
    void m1(){
        System.out.println("This is m1 method");
    }
    public static void main(String[] args) throws NoSuchMethodException {
        FirstAnnotation ob = new FirstAnnotation();
        ob.m1();

        if (FirstAnnotation.class
                .getDeclaredMethod("m1")
                .isAnnotationPresent(Method.class)) {

            System.out.println("@Method annotation is present on m1()");
        }
    }
}

