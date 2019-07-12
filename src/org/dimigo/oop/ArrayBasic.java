package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //int, Long, boolean, char, float, double, short, byte
        int[] intArr = new int[5];
        printArray(intArr);
        System.out.println();

        int[] intArr2={1,2,3,4,5};
        printArray(intArr2);

        String[] strArr = new String[3];

        strArr[0] = "치킨";
        strArr[1] =" 족발";
        strArr[2]="짜장면";
        printArray(strArr);

        String[] strArr2={
                "트와이스",
                "블랙핑크",
                "씨젬"};
        printArray(strArr2);

        Book[] bookArr = new Book[2];
        bookArr[0]=new Book("수학의바이블","김재영",100);
        bookArr[1]=new Book("워마","전유원",100);

        printArray(bookArr);

        Book[] bookArr2 = {
                new Book("수학의바이블","김재영",100),
                new Book("워마","전유원",100)
        };

        //주의사항!!!!!!!!!!!
        String[] strArr3 = new String[3];
        System.out.println(strArr3.length);
        // System.out.println(strArr3[strArr3.length]); X
        System.out.println(strArr3[strArr3.length-1]);
        System.out.println(strArr3[0]); //null
        System.out.println(strArr3[0].length()); //X

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);
        System.out.println(bookArr3[0].getTitle());
    }


    private static void printArray(Book[] bookArr) {
        for(Book value: bookArr){
            System.out.println(value);
        }
    }

    private static void printArray(int[] intArr) {
//        for(int i=0;i<intArr.length;i++)
//            System.out.print(intArr[i]+"|");
        for(int value :intArr){
            System.out.print(value + "l");
        }
    }
    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value+"|");
        }

        System.out.println();
    }
}
