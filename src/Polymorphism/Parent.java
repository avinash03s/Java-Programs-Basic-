package Polymorphism;

public class Parent {
    void play(){                                                //default method are overloaded and overriding;
        System.out.println("Parent play cricket");
    }

    void play(String n){                                          //default parameter method;
        System.out.println(n+" "+"Parent play cricket");
    }

    static void run(){                                         //static method are overladed but not override;
        System.out.println("run fast");
    }

    static void run(int r){                                    //static arg- method;
        System.out.println(r+" "+" static  method are overload ");
    }

    final void speak(){                                        //final method are overloaded but not override;
        System.out.println("comment on players");
    }
    final void speak(String comment){                          //final arg- method;
        System.out.println(comment +" "+" final method are overloaded ");
    }

    protected void calculateScore(){                           //protected method are overloaded and overriding;
        System.out.println("match score is : ");
    }

    protected void calculateScore(int score){ //
        System.out.println(score +" "+"Your score is "+ " Protected method are overloaded");
    }

    private void runRate(){//                                 private method are only overloaded not override
        System.out.println("Current runRate is :");
    }

    private void runRate(double R){
        System.out.println(R + "Current runRate"+ " private method are overloaded");
    }



}
class Child extends Parent{
    @Override
    void play() {
        System.out.println("Child Play cricket");
    }

    @Override
    void play(String n) {
        System.out.println(n +" "+"Child play cricket");
    }

    @Override
    protected void calculateScore() {
        System.out.println("Child score is :");
    }

    @Override
    protected void calculateScore(int score) {
        System.out.println(score +" "+"Protected method are override");
    }



}
class Main1 {
    public static void main(String[] args) {
        Child ob= new Child();
        ob.play();
        ob.play("Avinash");
        ob.calculateScore();
        ob.calculateScore(139);

        Parent obj=new Parent();
        obj.play();
        obj.play("Surwase");
        Parent.run();
        Parent.run(55);
        obj.speak();
        obj.speak("Well played");
        obj.calculateScore();
        obj.calculateScore(200);



    }
}
