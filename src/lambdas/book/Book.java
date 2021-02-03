package lambdas.book;

public class Book {
    private int id;
    private String author;
    private String title;

    public int getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }
}
