package Constructor;

class Book{
    String title;
    String author;

    Book(){

        System.out.println("Item not created");
    }
    /*void run(){
        System.out.println("Hi");
    }*/
    Book(String title,String author){
        this.title=title;
        this.author=author;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("-----------------");
    }
}
class Ebook extends Book{
    Ebook(){
        super();
        System.out.println("Magazine created");
    }
    Ebook(String title,String author,double fileSize){
        this();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+fileSize);
        System.out.println("----------------");
    }
}


public class PrintedBook extends Book{
    PrintedBook(){
        super();
        System.out.println("Book created");
    }
    PrintedBook(String title, String author,double pages){
        this();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+pages);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        PrintedBook ob= new PrintedBook("Java programing","James Gosling",500);
        Ebook ob1= new Ebook("Tech Today","IEEE",150);
        //ob.run();
    }
}
