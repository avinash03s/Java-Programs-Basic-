package MathodCallingPractice;

public class Addition {
    int a=10;
    int b=20;

    void add(){
        //instance area
        //we call directly instance variable within instance method without object reference
        System.out.println(a);
        System.out.println(b);

        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        //static area

        Addition ob= new Addition();
        ob.add();

    }
}
