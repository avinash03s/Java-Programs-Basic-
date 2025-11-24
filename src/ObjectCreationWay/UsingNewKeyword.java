package ObjectCreationWay;

public class UsingNewKeyword {
    public static void main(String[] args) {
        UsingNewKeyword ob= new UsingNewKeyword();
        ob.show();
    }
    void show(){
        System.out.println("UsingNewKeyword.show");
    }
}

class FactoryMethodWay{
    public static void main(String[] args) {
        try {
            Class cls=Class.forName("ObjectCreationWay.FactoryMethodWay");
            FactoryMethodWay ob= (FactoryMethodWay) cls.newInstance();
            ob.play();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    void play(){
        System.out.println("FactoryMethodWay.play");
    }
}
