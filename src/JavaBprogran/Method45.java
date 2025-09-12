package JavaBprogran;

public class Method45 {
    /*int a=10,b=20;      //instance variable
    int c=a+b;*/
    private void add() {                 //instance method
        int a = 10, b = 20;          //local variable
        System.out.println(a + b);
    }

    class Method46 extends Method45 {

        public static void main(String[] args) {
            Method45 ob = new Method45();
            ob.add();

        }
    }
}
