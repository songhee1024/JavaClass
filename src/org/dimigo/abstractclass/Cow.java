package org.dimigo.abstractclass;

public class Cow extends Animal {


    public void eat(){
        System.out.println("냠냠");
    }

    @Override
    public void bark() {
        System.out.println("음메");
    }
}
