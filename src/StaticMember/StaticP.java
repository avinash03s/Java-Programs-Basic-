package StaticMember;

public class StaticP {
    public static int count=0;
    public int id;

    public StaticP(){
        count++;
        id=count;
    }

    public static void printCount(){
        System.out.println("Number of instance: "+count);
    }

    public void printId(){
        System.out.println("Instance id : "+id);
    }

    public static void main(String[] args) {
       /* StaticP ob= new StaticP();
        StaticP ob1= new StaticP();
        StaticP ob2= new StaticP();

        ob.printId();
        ob1.printId();
        ob2.printId();

        StaticP.printCount();
*/
        StaticP [] arr= new StaticP[100];
        for (int i=0; i<100;i++){
            arr[i]=new StaticP();
        }

        for (int i= 0; i<100;i++){
            arr[i].printId();
        }
        StaticP.printCount();
    }

}
