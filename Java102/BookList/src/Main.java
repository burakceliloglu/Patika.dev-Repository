import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Book 1", 200, "Author1", "01/01/2023"));
        books.add(new Book("Book 2", 250, "Author2", "02/01/2023"));
        books.add(new Book("Book 3", 300, "Author3", "03/01/2023"));
        books.add(new Book("Book 4", 350, "Author4", "04/01/2023"));
        books.add(new Book("Book 5", 400, "Author5", "05/01/2023"));
        books.add(new Book("Book 6", 450, "Author6", "06/01/2023"));
        books.add(new Book("Book 7", 500, "Author7", "07/01/2023"));
        books.add(new Book("Book 8", 550, "Author8", "08/01/2023"));
        books.add(new Book("Book 9", 600, "Author9", "09/01/2023"));
        books.add(new Book("Book 10", 650, "Author 10", "10/01/2023"));

        HashMap<String,String> bookAndAuthor = new HashMap<>();
        books.forEach(book -> bookAndAuthor.put(book.getName(), book.getAuthor()));
        bookAndAuthor.forEach((name, author) -> System.out.println("Book name: " + name + ", Author name: " + author));

        System.out.println();

        HashMap<String, String> newMap = new HashMap<>();
        books.stream().filter(book -> book.getPages() > 100).forEach(book -> newMap.put(book.getName(), book.getAuthor()));
        newMap.forEach((name, author) -> System.out.println("Book name: " + name + ", Author name: " + author));
    }
}

