package StaticMember;

class Student {
    String name;
    int rollNo;

    //static variable
    static String collageName;

    //static counter(variable name) to set unique roll no
    static int counter=0;

    //constructor
    public Student(String name){
        this.name=name;
        this.rollNo=setRollNo();
    }

    static int setRollNo()
    {
        counter++;
        return counter;
    }
    static void setCollageName(String name){
        collageName=name;
    }

    //instance method
    void getStudentInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("RollNo : "+this.rollNo);
        //access to static variable
        System.out.println("CollageName : "+collageName);

    }

}

public class StaticDemo {
    public static void main(String []args){
        //calling static method
        Student.setCollageName("Balbhim Collage Beed");

        String names[]={"Avinash","Ram","Rahul","Raju","Karan",
        "Pramod","Om","Ganesh","Avinash K","Sushil","Vrushabh","Ritesh",
                "Aniket"};

        Student[] ob= new Student[names.length];

        for (int i=0;i<names.length;i++){
            ob[i] =new Student(names[i]);
            ob[i].getStudentInfo();
        }





    }
}
