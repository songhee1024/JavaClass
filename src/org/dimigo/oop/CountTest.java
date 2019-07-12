package org.dimigo.oop;

public class CountTest {
    public static void main(String[] args) {
        for(int i =0 ; i<10 ;i ++){
            new Count(); //10개 만들어짐
        }

        System.out.println(Count.getCnt());
    }
}
