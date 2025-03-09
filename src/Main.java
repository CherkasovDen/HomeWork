import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Author block = new Author ("Блок", "Александр");
        Author chehov = new Author("Чехов", "Антон");

        Book book1 = new Book("Двенадцать", block, 1918);
        Book book2 = new Book("Хамелеон", chehov, 1884);
        Book book3 = new Book("Крыжовник", chehov, 1898);
        Book book4 = new Book("Скифы", block, 1918);

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);
        System.out.println();
        System.out.println(book4);
        System.out.println();

        book4.setYearOfPublication(1900);
        System.out.println("book4.getYearOfPublication() = " + book4.getYearOfPublication());

        System.out.println(chehov.hashCode());
        System.out.println(block.hashCode());

        System.out.println(chehov.equals(block));
        System.out.println(book4.getYearOfPublication()==(book3.getYearOfPublication()));




    }
}
