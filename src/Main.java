import org.w3c.dom.ls.LSOutput;

public class Main {

public static void main(String[] args) {

    Author author1 = new Author("King", "Stiven");
    Author author2 = new Author("Tolstoy", "Leo");
    Book book1 = new Book(author1, "It", 1990);
    Book book2 = new Book(author2, "War and Peace", 1873);

    //book1.setPublishYear(2000);

    //Книга
    System.out.println(book1.toString());
    System.out.println(book1.equals(book2));
    System.out.println(book1.hashCode());

    //Автор
    System.out.println();
    System.out.println(author1.toString());
    System.out.println(author1.equals(book2));
    System.out.println(author1.hashCode());
    System.out.println(author2.hashCode());


}

}
