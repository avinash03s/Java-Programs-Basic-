package Interfaces;

interface A {
    void sum();
}
interface B{


}
interface c extends A,B{
      default void run(){
          
      };
}
class Myclass implements A,B{
    @Override
    public void sum() {

    }

}
