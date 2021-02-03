package lambdas.book;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        List<Book> foundBooks = bookCollection.findBooks(book -> book.getTitle() == "Ion");

        for (Book book : foundBooks) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }
}
