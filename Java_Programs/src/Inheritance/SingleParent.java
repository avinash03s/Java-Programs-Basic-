package Inheritance;

//single Inheritance

class SingleParent{
    void get(){
        System.out.println("Hi I am a parent");
    }
}
class SingleChild extends SingleParent{
    @Override
    void get() {
        super.get();
        System.out.println("hi I am child");
    }

    public static void main(String[] args) {
        SingleChild ob= new SingleChild();
        ob.get();
    }
}
