import java.util.Objects;

public class Book {
    private String book;
    private Author nameOfAuthor;
    private int yearOfPublication;

    public Book(String book, Author nameOfAuthor, int yearOfPublication) {
        this.book = book;
        this.nameOfAuthor = nameOfAuthor;
        this.yearOfPublication = yearOfPublication;
    }



    public String getBook() {
        return this.book;
    }

    public Author getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return yearOfPublication == book1.yearOfPublication && Objects.equals(book, book1.book) && Objects.equals(nameOfAuthor, book1.nameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, nameOfAuthor, yearOfPublication);
    }

    @Override
    public String toString() {
        return "Название: " + book + ", \nАвтор" + nameOfAuthor + ", \nГод публикации" + yearOfPublication;
    }
}
