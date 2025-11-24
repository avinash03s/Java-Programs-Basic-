package ExceptionHandling;

class Question1 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
        System.out.println("C");
    }
}

class Question2 {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Question3 {
    public static void main(String[] args) {
        try {
            int a=5/1;
        } catch (Exception e) {
            System.out.println("Error");
        }finally {
            System.out.println("Done");
        }
    }
}

class Question4 {
    public static void main(String[] args) {
        try {
            int arr[]={1,2,3};
            System.out.println(arr[5]);
            System.out.println("A");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}

class Question5 {
    public static void main(String[] args) {
        try {
            String s="123s";
            int num= Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("X");
        } catch (Exception e) {
            System.out.println("Y");
        }
    }
}

class Question6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
            String s=null;
            System.out.println("A");
            System.out.println(s.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}

class Question7 {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            System.out.println("X");
            int c= a/b;
            System.out.println("Y");
        }catch (ArithmeticException e){
            System.out.println("Z");
        }finally {
            System.out.println("F");
        }
    }
}
class Question8{
    public static void main(String[] args) {
        try {
            String s="hello";
            System.out.println(s.charAt(10));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("P");
        } catch (Exception e) {
            System.out.println("Q");
        }
    }
}
class Question9{
    public static void main(String[] args) {
        try {
            System.out.println("1");
            int arr[]=new int[-5];
            System.out.println("2");
        }catch (NegativeArraySizeException e){
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("4");
        }finally {
            System.out.println("5");
        }
    }
}

class Question10{
    public static void main(String[] args) {
        try{
            int a= Integer.parseInt("10");
            int b= Integer.parseInt("A10");
            System.out.println("X");
        } catch (NumberFormatException e) {
            System.out.println("Y");
        }finally {
            System.out.println("Z");
        }
    }
}

class Question11{//outPut: ClassCastException;
    public static void main(String[] args) {
        try {
            Object obj="Avi";
            Integer i=(Integer) obj;
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}

class Question12{
    public static void main(String[] args) {
        try{
            String s="abc";
            System.out.println(s.charAt(1));
            System.out.println(s.charAt(5));
            System.out.println("X");
        }catch (Exception e){
            System.out.println("Y");
        }finally {
            System.out.println("Z");
        }
        System.out.println("Q");
    }
}