package StaticMember;

public class Geeks {
    private static String strname="AgroStack";

    //static class

    static class NestedClass{
        //non-static member
        public void display(){
            System.out.println(strname);
        }
    }

    public static void main(String[] args) {
        Geeks.NestedClass ob= new Geeks.NestedClass();
        ob.display();
    }
}
