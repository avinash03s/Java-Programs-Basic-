package Multithreading.ThreadGroup;

public class ThreadGroupClass {

    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("First Group");
        System.out.println(g.getParent().getName());//main
        System.out.println(g.getName()); //First Group
        g.list();//print information about thread group
        System.out.println(g.activeCount());
    }
}
