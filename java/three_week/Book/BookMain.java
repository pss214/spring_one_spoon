package java.three_week.Book;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바","홍길동");
        Book book2 = new Book("스프링", "한모금");
        Book book3 = new Book("한국", "대통령");
        Book book4 = new Book("it", "???");
        List<Book> a = new ArrayList<>();
        a.add(book1);
        a.add(book2);
        a.add(book3);
        a.add(book4);
        System.out.println(a.get(0));
    }
}
