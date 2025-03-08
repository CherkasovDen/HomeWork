public class Book {
    private String book;
    private Author nameOfAuthor;
    private int yearOfPublication;

    public Book (String book, Author nameOfAuthor, int yearOfPublication) {
        this.book = book;
        this.nameOfAuthor = nameOfAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBook() {
        return  this.book;
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
}
