package Abstraction;


abstract class Rule44{
    abstract void taken();
    abstract void add();
    abstract void play();
    /*ever abstract method in abstract class it is mandatory to implements/override  in
    * their child class */

}
public class AbsRule4 extends Rule44{

    @Override
    void taken() {

    }

    @Override
    void add() {

    }

    @Override
    void play() {

    }

}
class Classes {
    public static void main(String[] args) {
        AbsRule4 ob= new AbsRule4();
    }
}
