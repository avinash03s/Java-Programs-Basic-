package java_9_feature;

public interface InterfaceChanges {
    private void add(){
        System.out.println("This is private method form Interface Java 9");
    }

    private static void multi(){
        System.out.println("This is private static method form Interface Java 9");
    }
}
class Main{

    public static void main(String[] args) {

    }
}
/// 1)Private methods enhance the code re-usability inside the interfaces. For example, if two or more methods have the
///common code to execute then put that code block in a private method and call it whenever you require.

/// 2)Using private methods, you can have control over what to hide and what to expose to outside the interface.
///If you have a sensitive data and want to use inside the interface only, then private methods will be of great use.
