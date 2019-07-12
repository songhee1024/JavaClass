package org.dimigo.interfaces;

public interface IAnimal {
    public static final String FARM_NAME = "디미동농";
    String FARM_NAME2 = "디미동농"; //자동으로 public static final
    //모든 메소드는 추상 메소드

    //public abstract void eat();
    //abstract void sleep();
    void bark();

    default void eat(){   //추상 메소드가 아니다 -- > 구현부 넣을 수 있음
        System.out.println("냠냠");
    }
    default void sleep(){
        System.out.println("쿨쿨");
    }

    static void welcome(){  //자동으로 public 붙음
        System.out.println(FARM_NAME + "에 오신걸 환영");

    }
}
