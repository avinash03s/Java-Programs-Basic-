package Inheritance;


//Multilevel Inheritance

/*
* In this Multilevel Inheritance chain like GrandParent => Parent => Child,
* means Child access to parent & Parent access to GrandParent*/


class MGrandParent{
    void sum(){
        System.out.println("I am grand parent");
    }
}

class MParent extends MGrandParent{
    void set(){
        System.out.println("I am parent ");
    }
}

class MChild extends MParent{
    void get(){
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        MChild ob=new MChild();
        ob.sum();
        ob.set();
        ob.get();
    }
}
