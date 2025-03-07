public class Author {
    private String name;
    private String surname;

    public Author(String surname, String name) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return surname + " " + name;
    }


}
