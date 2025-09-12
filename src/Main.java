public class Main {
    public static void main(String[] args) {/// these method are hide
        System.out.println("Hello");

    }

    public static void main(int a){
        System.out.println("hi");
    }

}
class Child extends Main{
    public static void main(String[] args) {
        Main.main(44);
    }
}

/*in these code i overloaded main method and inside the child */