package org.dimigo.inheritance;

public class PersonTest2 {
    public static void main(String[] args) {
        Person2 [] person2 = {
                new Person2("Tom"),
                 new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person2 p : person2){
            greeting(p);
            System.out.println();
        }

    }

    private static void greeting(Person2 p) {
        System.out.println(p);
        p.sayHello();
        p.sayBye();
    }
}
