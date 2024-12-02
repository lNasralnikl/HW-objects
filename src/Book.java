public class Book {

    private Author author;
    private String name;
    private int publishYear;


    public Book(Author author, String name, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;

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
