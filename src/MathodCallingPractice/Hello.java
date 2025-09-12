package MathodCallingPractice;

public class Hello {
    void hey(){
        System.out.println("Print");
    }
    char jeta(char a){
        System.out.println("Anna");
        return 0;
    }

    public static void main(String[] args) {
        Hello ob= new Hello();
        ob.hey();
        ob.jeta('A');
    }
}
