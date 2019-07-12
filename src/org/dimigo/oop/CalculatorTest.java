package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20;

        Calculator c = new Calculator(a,b); //객체 생성

        System.out.println("<< 실행 결과 >>");
     //   c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,c.add());
        System.out.printf("%d - %d = %d\n",a,b,c.sub());
        System.out.printf("%d * %d = %d\n",a,b,c.mul());
        System.out.printf("%d / %d = %.1f\n",a,b,c.div());
        c.powerOff();
    }
}
// 인스턴스 멤버(Static이 없는 것) 는 객체를 생성해야만 사용할 수 있다 !!! --> 객체와 관련
// Static 이 붙으면 객체와 무관해짐 --> "객체를 생성하지 않고 바로 사용이 가능하다" -->클래스와 연관
