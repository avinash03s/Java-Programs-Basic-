package Constructor;
class ParentNumber{
    ParentNumber(){
        this(4,5);
        System.out.println("parent no arg"); //2
    }
    ParentNumber(int x,int y){

        System.out.println("parent 2 args");  //1
    }
}
public class ChildNumberClass extends ParentNumber{
    ChildNumberClass(){
        System.out.println(" child no-arg");  //3
    }
    ChildNumberClass(int a){
        this();
        System.out.println("1 arg");  //4
    }
    ChildNumberClass(int b,String c){
        this(45);
        System.out.println("2 arg"); //5
    }

    public static void main(String[] args) {
        ChildNumberClass ob= new ChildNumberClass(30,"Java");
    }
}
