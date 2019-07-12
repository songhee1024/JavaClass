//package org.dimigo.oop;
//
//public class Calculator2 { //static X --> 인스턴스 필드 (객체를 new 해서 생성해야 사용 가능)
//
//    private boolean powerFlag;
//
//  public static void powerOn(){
//        if(!powerFlag) {
//            System.out.println("전원을 켭니다");
//            powerFlag = true;
//        }
//    }
//
//    public void powerOff(){
//        if(powerFlag) {
//            System.out.println("전원을 끕니다");
//            this.powerFlag = false;
//        }
//    }
//
//
//    public static int add(int num1, int num2,Calculator2 c) {
//        c.powerOn();
//        return num1 + num2;
//    }
//
//    public static int sub(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return num1 - num2;
//    }
//
//    public static int mul(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return num1*num2;
//    }
//
//    public static double div(int num1, int num2, Calculator2 c){
//        c.powerOn();
//        return (double)num1/num2;
//
//    }
//}
