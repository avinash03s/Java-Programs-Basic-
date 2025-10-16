package Encapuslation;

import static java.lang.Integer.parseInt;

class Encapsulation{
    Integer id;
    //set
    public void setId(Integer id) {
        this.id = parseInt(String.valueOf(id));
    }
    //get
    public String getId(){
        System.out.println("Student Id: "+id);
        return String.valueOf(id);
    }
}

public class ValueOfMethod {
    public static void main(String[] args) {
        Encapsulation ob= new Encapsulation();
        ob.setId(101);
        ob.getId();
    }
}

