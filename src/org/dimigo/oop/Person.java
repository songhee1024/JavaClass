package org.dimigo.oop;

public class Person {
   // private final String species = "포유류"; //초기값 정해주면 변경 불가
    private final String birthDate; //한 번 정해주면 변경 불가
    private String name;
    private static final String species = "포유류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "species='" + species + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
Person p1 = new Person("20021024","육송희");
Person p2 = new Person("20021111","김종수");
        System.out.println(p1);
        System.out.println(p2);
    }
}
