package lambdas.book;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        Map<Integer, String> foundBooks = bookCollection.findBooks(book -> book.getTitle().equals("Ion"));
        foundBooks.forEach((a, b) -> System.out.println(a + " " + b));
        long size = bookCollection.size(book -> book.getAuthor().contains("Mir"));
        System.out.println(size);
    }
}
