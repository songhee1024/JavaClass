package org.dimigo.oop;

public class BookTest2 {

    private static void compare(){
        int a=10;
        int b=a;

        System.out.println(a == b? "true" : "false");

        Book book = new Book();
        Book book2 = book;

        System.out.println(book == book2? "true" : "false");


    }
    public static void main(String[] args) {
        compare();
    }
}
