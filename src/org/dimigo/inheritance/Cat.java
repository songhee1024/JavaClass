package org.dimigo.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    //부모클래스의 메소드를 자식 클래스에서 재정의
    public void bark(){
        System.out.println("야옹");
    }
    public void scratch(){
        System.out.println(".");
    }
}
