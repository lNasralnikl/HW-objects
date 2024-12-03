import java.util.Objects;

public class Book {

    private Author author;
    private String name;
    private int publishYear;


    public Book(Author author, String name, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;

    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

}
