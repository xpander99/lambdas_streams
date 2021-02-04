package lambdas.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookCollection {
    private List<Book> books;


    public Map<Integer, String> findBooks(Predicate<Book> searchCriteria) {
        return this.books
                .stream()
                .filter(searchCriteria)
                .collect(Collectors.toMap(Book::getId, Book::getTitle));

    }

    public long size(Predicate<Book> searchCriteria) {
        return this.books
                .stream()
                .filter(searchCriteria)
                .count();
    }


    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(1, "Liviu Rebreanu", "Adam si Eva"));
        books.add(new Book(2, "Liviu Rebreanu", "Ion"));
        books.add(new Book(3, "Mircea Eliade", "La Tiganci"));
    }
}
