import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Author block = new Author ("Block", "Alex");
        System.out.println("block.surname = " + block.getSurname());
        System.out.println("block.name = " + block.getName());

        Author chehov = new Author("Chehov", "Anton");
        System.out.println("chehov.surname = " + chehov.getSurname());
        System.out.println("chehov.name = " + chehov.getName());


        Book book1 = new Book("Двенадцать", block, 1918);
        System.out.println("book1.book = " + book1.getBook());
        System.out.println("book1.nameOfAuthor = " + book1.getNameOfAuthor());
        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());

        Book book2 = new Book("Хамелеон", chehov, 1884);
        System.out.println("book2.book = " + book2.getBook());
        System.out.println("book2.nameOfAuthor = " + book2.getNameOfAuthor());
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());

        book2.setYearOfPublication(1900);
        System.out.println("book2.getYearOfPublication = " + book2.getYearOfPublication());
    }
}
