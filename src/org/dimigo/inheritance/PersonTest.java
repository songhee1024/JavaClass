package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("잔나비",25,180,70);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("2620","육송희",18,154,42);
        System.out.println(s);
        s.eat();
        s.sleep();
        s.study();
        s.rollCall();

        Teacher t = new Teacher("화학","김종수",48,180,70);
        System.out.println(t);
        t.eat();
        t.sleep();
        t.doTask();
        t.teach();
    }
}

