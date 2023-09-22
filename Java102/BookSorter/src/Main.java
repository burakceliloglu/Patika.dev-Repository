import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        Book book1 = new Book("A Brief History of Humankind",353,"Yuval Noah Harari","1999.09.19");
        Book book2 = new Book("On the Origin of the Species",901,"Charles Darwin","1859-01-01");
        Book book3 = new Book("Brief Answers to the Big Questions",167,"Stephen Hawking","2018-01-01");
        Book book4 = new Book("Lord of The Flies",314,"William Golding","1954-01-01");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for(Book book: books){
            System.out.println("Book Name: " + book.getName() +
                    "\nPage Number: " + book.getPageNumber() +
                    "\nAuthor Name: " + book.getAuthor() +
                    "\nReleased Date: " + book.getDate() +
                    "\n***********************************");
        }

        System.out.println();

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);

        for(Book book: books2){
            System.out.println("Book Name: " + book.getName() +
                    "\nPage Number: " + book.getPageNumber() +
                    "\nAuthor Name: " + book.getAuthor() +
                    "\nReleased Date: " + book.getDate() +
                    "\n***********************************");
        }
    }
}