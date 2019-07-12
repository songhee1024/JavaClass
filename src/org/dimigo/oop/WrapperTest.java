package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive Type 을 Wrapping(Integer.SIZE 같은 메소드들을 사용하기 위해 객체로 만들어주는 과정) 해주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));

        //Boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double i5 = Double.valueOf(3.14);

        //unBoxing
        int r1 = i1.intValue();

        int r3 = Integer.parseInt("300");

        double r4 = Double.parseDouble("3.14"); //"3.14"를 double 로 바꿔줌

        //100 + 200 = 300

        int a1 = Integer.parseInt(args[0]); //문자열을 int 타입으로 바꿔주는 것
        int a2 = Integer.parseInt(args[1]);
        System.out.println(a1+a2);

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);

        System.out.println(obj1+obj2); //autounboxing

        Integer a=1000; // autoboxing
        int b = a+100; // autounboxing

        Integer c = 10; //autoboxing
        Integer d = c+20; // autounboxing, autoboxing
        Integer result = c + d; //autounboxing, autounboxing, autoboxing

    }
}
