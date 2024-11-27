public class Book {

    private String author;
    private String name;
    private int publishYear;

    public Book(Author author, String name, int publishYear) {
        this.author = String.valueOf(author);
        this.name = name;
        this.publishYear = publishYear;

    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getPublishYear(){
        return this.publishYear;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }

}
