package OperatorProgram;

public class LogicalOp {
    public static void main(String[] args) {
        //1st syntax
        int a= 200;
        int b=300;
        int c=400;
       /* boolean check=(a<b) && (b<c) ;
        boolean m=(a>b) && (b>c);
        boolean k=(a>b) && (b<c);
        boolean z=(a<b) && (b>c);
        System.out.println(check);
        System.out.println(m);
        System.out.println(k);
        System.out.println(z);*/


        /*boolean or=(a<b) || (b<c) ;//1st condition is true & 2nd condition is true ==> true
        boolean ro= (a>b) || (b>c);//1st condition is false & 2nd condition is false ==> false
        boolean mo= (a<b) || (b>c);//1st condition is true & 2nd condition is false ==> true
        boolean no= (a>b) || (c<b);//1st condition is false & 2nd condition is true ==> false
        System.out.println(or);
        System.out.println(ro);
        System.out.println(mo);
        System.out.println(no);*/


        boolean or=!((a<b) || (b<c)) ;//1st condition is true & 2nd condition is true ==> true  but Ans=>false
        boolean ro= !((a>b) || (b>c));//1st condition is false & 2nd condition is false ==> false but Ans=>true
        boolean mo= !((a<b) || (b>c));//1st condition is true & 2nd condition is false ==> true but Ans=>false
        boolean no= !((a>b) || (c<b));//1st condition is false & 2nd condition is true ==> false but Ans=>true
        System.out.println(or);
        System.out.println(ro);
        System.out.println(mo);
        System.out.println(no);


    }
}
