
class ParentDemo {
    void run() {
        System.out.println("Hi I am parent class");
    }
}

class ChildDemo extends ParentDemo {
    void play() {
        System.out.println("Hi I am child class");
    }
}

public class DownCasting {

    public static void main(String[] args) {
        ParentDemo ob = new ChildDemo();
        ChildDemo ob1 = (ChildDemo) ob;
        ob1.run();
        ob1.play();
    }
}
