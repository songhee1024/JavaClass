package org.dimigo.oop;

public class Calculator { //static X --> 인스턴스 필드 (객체를 new 해서 생성해야 사용 가능)
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn(){ //Static X --> 인스턴스 메소드 ( 객체를 new 해서 생성해야 사용가능)
        if(!powerFlag) {
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }
    }

    public void powerOff(){
        if(powerFlag) {
            System.out.println("전원을 끕니다");
            this.powerFlag = false;
        }
    }


    public int add(){
        this.powerOn();
        return this.num1 + this.num2; //this : 나 자신을 가리키는 객체 ( 이미 객체로 되었다)
    }

    public int sub(){
        powerOn();
        return num1-num2;
    }

    public int mul(){
        powerOn();
        return num1*num2;
    }

    public double div(){
        powerOn();
        return (double)num1/num2;

    }
}
