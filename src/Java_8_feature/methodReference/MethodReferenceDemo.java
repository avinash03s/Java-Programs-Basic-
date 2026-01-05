package Java_8_feature.methodReference;

interface Student {
    String getName();
}

public class MethodReferenceDemo {
    public static void main(String[] args) {

        Student std = ()-> "Avinash";
        System.out.println(std.getName());

    }
int a = 10;
    void something(){
         a = 10;
        Student student = new Student() {

            @Override
            public String getName() {
                return "Avinash";
            }
        };
        System.out.println(student.getName());
    }
}
