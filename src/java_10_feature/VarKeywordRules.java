package java_10_feature;

public class VarKeywordRules {

    public static void main(String[] args) {
        var name = "Avinash";
        var age = 21;
        System.out.println("Name : " + name + "|" + "Age : " + age);

        //1) var works only when you initialize the variable explicitly.
        // Because, compiler uses this initialization to determine the type of the variable.
        // If you don’t initialize var variable, compiler shows the error.
        //2) var is only for local variables. It is not allowed for global variables.
        //3) You can’t use var as method parameters and return types.
    }
}
