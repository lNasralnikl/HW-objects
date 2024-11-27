import org.w3c.dom.ls.LSOutput;

public class Main {

public static void main(String[] args) {

    Author author1 = new Author("King", "Stiven");
    Author author2 = new Author("Tolstoy", "Leo");
    Book book1 = new Book(author1, "It", 1990);
    Book book2 = new Book(author2, "War and Peace", 1873);

    //book1.setPublishYear(2000);

    System.out.println(book1.getAuthor() + " " + book1.getName() + " " + book1.getPublishYear());

}

}
