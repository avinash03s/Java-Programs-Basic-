package ExceptionHandling;

import java.io.IOException;

public class CustomExcetionDemo{

    void show() {
        System.out.println("CustomExcetionDemo.show");
    }
}
class Demo extends CustomExcetionDemo {
    @Override
    void show() throws RuntimeException{
        System.out.println("ABC");
    }
}
