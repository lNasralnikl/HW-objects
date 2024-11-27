public class Author {

    private String surname;
    private String name;

public String toString(){
    return surname + " " + name;
}

    public Author(String surname, String name){
        this.name = name;
        this.surname = surname;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname = surname;

    }

    public void setName(String name){
        this.name = name;

    }


}
