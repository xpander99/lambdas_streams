package lambdas.book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookCollection {
    private List<Book> books;

    public List<Book> findBooks(Predicate<Book> searchCriteria) {
        List<Book> results = new ArrayList<>();
        for (Book nextBook : books) {
            if(searchCriteria.test(nextBook))
                results.add(nextBook);
        }
        return results;
    }

    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(1, "Liviu Rebreanu", "Adam si Eva"));
        books.add(new Book(2, "Liviu Rebreanu", "Ion"));
        books.add(new Book(3, "Mircea Eliade", "La Tiganci"));
    }
}
