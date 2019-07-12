package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr,10);
        printArray(intArr); //11,12~

        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names, "김");
        printArray(names);
    }
    private static void add(int[] intArr, int a){
        for(int i=0; i<intArr.length; i++){
            intArr[i] +=a;
        }
    }
    private static void printArray(int[] intArr){
        for(int value : intArr){
            System.out.println(value);
        }
    }
    private static void printArray(String[] names){
        for(String value : names){
            System.out.println(value);
        }
    }
    private static void changeName(String[] names, String f){
        for(int i=0; i<names.length;i++){
            names[i] = f + names[i].substring(1);
        }
    }
}
