package Encapuslation;

public class Student {
    private String stdName;
    private int rollNo;
    private int stdId;
    private static String collageName;


    //set Method;
    public void setStdName(String stdName) {
        this.stdName=stdName;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setStdId(int stdId){
        this.stdId=stdId;
    }
    public static void setCollageName(String collageName) {
        Student.collageName = collageName;
    }

    //getMethod;
    public void getStdName() {
        System.out.println("Student Name: "+stdName);
    }
    public void getRollNo() {
        System.out.println("Student RollNo: "+rollNo);
    }
    public void getStdId() {
        System.out.println("Student College Id: "+stdId);
    }
    public static void getCollageName() {
        System.out.println("Collage Name: "+collageName);
    }
}
