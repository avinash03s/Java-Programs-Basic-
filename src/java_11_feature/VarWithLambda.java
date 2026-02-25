package java_11_feature;

interface FunctionalInterfaceDemo {
    void add(int a, int b);
}

public class VarWithLambda {

    public static void main(String[] args) {


        FunctionalInterfaceDemo functionalInterfaceDemo = (var a, var b) -> System.out.println(a + b);
        functionalInterfaceDemo.add(40, 5);

        //Rules To Follow While Using var In Lambdas :
        //1) Lambda parameters declared with var must be enclosed in parentheses ( ) even though there is only one parameter.
        //var s -> Integer.valueOf(s)          //Compile time error
        //(var s) -> Integer.valueOf(s)       // No Error

        //2) Mixing var with other non-var parameters is not allowed. It has to be all var or no var.
        //(var m, int n) -> m * n     //Compile Time Error
        //(var m, var n) -> m * n     //No Error

        //3) Using var for one parameter and skipping for other parameters is also not allowed.
        //(var m, n) -> m * n            //Compile Time Error
        //(var m, var n) -> m * n         //No Error


    }
}
