package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("작자미상");

        System.out.println(book.getTitle());

        System.out.println(book.getAuthor());

        System.out.println(book.getPage());

    }
}
