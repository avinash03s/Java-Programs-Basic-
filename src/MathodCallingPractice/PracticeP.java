package MathodCallingPractice;

public class PracticeP {
    int method(String a, int b){
        System.out.println("1st Method = ");
        return 0;
    }
    void support(char c, boolean d){
        System.out.println("2nd Method = ");
    }
    void guru(short e, double f, int g, char h, boolean i){
        System.out.println("3rd Method");
    }
    boolean matter(boolean j){
        System.out.println("4th Method");
        return false;
    }
    void concept(){
        System.out.println("5th Method");
    }

    public static void main(String[] args) {
        PracticeP ob = new PracticeP();
        ob.method("Avinash",45);
        ob.support('A',true);
        ob.guru((short) 4,565.6,57,'G',false);
        ob.matter(true);
        ob.concept();



    }
}
