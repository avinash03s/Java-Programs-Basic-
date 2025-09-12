package Constructor;
class Parentcons{
    Parentcons(){
        this(4);
        System.out.println("no-arg");    //2nd
    }
    Parentcons(int z){
        System.out.println("1 arg");      //1st run this line
    }

}
public class Child extends Parentcons {

    /*Child(){
        this(40);
        System.out.println("Child but no-args");  //4th
    }
    Child(int b){
        System.out.println("Child but 1 args");  //3rd
    }
    Child(int a,String c){
        this();
        System.out.println("2 arg");  //5th
    }*/
    public static void main(String[] args) {
        Child ob= new Child();
    }
}

