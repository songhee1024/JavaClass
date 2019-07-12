package org.dimigo.inheritance;

public class PersonTest2_2 extends Person2 {
    public static void main(String[] args) {


        Person2[] p ={
                new Person2("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person2 person : p){
            System.out.println(person);
            person.sayHello();
            person.sayBye();
        }


    }
}
