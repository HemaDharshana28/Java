class BookData{
    String title;
    String author;
    int price;
    String genre;
}
public class Book {
    public static void main(String[] args){
        BookData b1=new BookData();
        BookData b2=new BookData();
        BookData b3=new BookData();
        BookData b4=new BookData();
        BookData b5=new BookData();
        b1.title="The Great Gatsby";
        b1.author="F. Scott Fitzgerald";
        b1.price=10;
        b1.genre="Fiction";
        b2.title="To Kill a Mockingbird";
        b2.author="Harper Lee";
        b2.price=12;
        b2.genre="Fiction";
        b3.title="1984";
        b3.author="George Orwell";
        b3.price=15;
        b3.genre="Dystopian Fiction";
        b4.title="Pride and Prejudice";
        b4.author="Jane Austen";
        b4.price=8;
        b4.genre="Romance";
        b5.title="The Catcher in the Rye";
        b5.author="J.D. Salinger";
        b5.price=11;
        b5.genre="Fiction";
        System.out.println("1."+b1.title+" "+b1.author+" "+b1.price+" "+b1.genre);
        System.out.println("2."+b2.title+" "+b2.author+" "+b2.price+" "+b2.genre);
        System.out.println("3."+b3.title+" "+b3.author+" "+b3.price+" "+b3.genre);
        System.out.println("4."+b4.title+" "+b4.author+" "+b4.price+" "+b4.genre);
        System.out.println("5."+b5.title+" "+b5.author+" "+b5.price+" "+b5.genre);
    }
}
