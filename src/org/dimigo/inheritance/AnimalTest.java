package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark(); //animal 의 bark()

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();

        Cat c = new Cat("아옹이");
        System.out.println(c);
        c.bark(); //cat의 brak()

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark(); //Tiger 의 bark()
        t.hunt();


        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal animal : animals){
//            System.out.println(animal);
//            animal.bark();
            doBark(animal);
        }

        Animal aa = new Cat("냐옹이");
        // aa.scratch();  -- Animal 타입이어서 Animal 에 있는 것만 가능 so ㄴscratch 불가
        ((Cat)aa).scratch(); // cat 타입으로 강제 캐스팅해서 호출하면 cat에만 있는 것도 가능

        Animal dog = new Dog("멍멍");
        Animal cat = new Cat("냐옹");
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Cat);
        System.out.println(dog instanceof Animal);

        doBark(dog);
        doBark(cat);


    }

    private static void doBark(Animal animal) {
        if(animal instanceof Dog)
            ((Dog) animal).wag();
        else if(animal instanceof Cat)
            ((Cat) animal).scratch();  //Cat 으로 타입 캐스팉ㅇ
    }
}
