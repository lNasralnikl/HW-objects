import java.util.Objects;

public class Author {

    private String surname;
    private String name;

    public String toString() {
        return surname + " " + name;
    }

    public Author(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getSurname(), author.getSurname()) && Objects.equals(getName(), author.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getName());
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public void setName(String name) {
        this.name = name;

    }


}
