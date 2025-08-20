package MathodCallingPractice;

public class Operator {
    void meet(int a,boolean b,String c,String d){
        System.out.println("1 Method");
    }
    boolean ant(boolean h){
        System.out.println("2 Method");
        return true;
    }
    void cat(){
        System.out.println("3 Method");
    }
    void net(int x, int y){
        System.out.println("4 Method");
    }

    public static void main(String[] args) {
        Operator s1= new Operator();
        s1.meet(34,true,"Arjun","Gayabai");
        s1.ant(true);
        s1.cat();
        s1.net(60,97);

    }
}
