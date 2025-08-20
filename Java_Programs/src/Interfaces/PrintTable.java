package Interfaces;

/*in this code I create interface & inside interface create method(abstract)
* then create concrete class and implements interface, then override method in concrete class
* and then create 2nd concreate class with method override/implements then inside main method
* create object of all concreate class and using obj reference call method.  */



public interface PrintTable {
    void print();
}
class  Document implements PrintTable{
    @Override
    public void print() {
        System.out.println("Print Document....");
    }
}
class Image implements PrintTable {
    @Override
    public void print() {
        System.out.println("Print Image..");
    }
}
class Main{
    public static void main(String[] args) {
       Image ob= new Image();
       ob.print();

       Document ob1= new Document();
       ob1.print();
    }
}
