package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int [2][3];
        printArray(intArr);

        intArr[0][2]=100;
        intArr[1][1]=100;

        //String 타입 이차원배열

        String[][] strArr = {
                {"C", "C++", "JAVA"}, {"C#", "PHP"}
        };
        String[][] strArr2 = {
                new String[]{"C", "C++", "JAVA"},
                new String[]{"C#", "PHP"}
        };
        String[][] strArr3 = new String[][] {
                new String[]{"C", "C++", "JAVA"},
                new String[]{"C#", "PHP"}
        };
        String[][] strArr4 = new String[][] {
                {"C", "C++", "JAVA"},
                {"C#", "PHP"}
        };

        printArray(strArr);

    }

    private static void printArray(int[][] intArr){
//        for(int i=0;i<intArr.length;i++){
//            for(int j=0;j<intArr[i].length;j++){
//                System.out.print(intArr[i][j]+"|");
//            }
//            System.out.println();
//        }
        for(int[] arr : intArr){
            for(int value : arr){
                System.out.printf(value +"|");
            }
            System.out.println();
        }
    }
    private static void printArray(String[][] strArr) {
        for(String[] arr : strArr){
            for(String value : arr){
                System.out.printf(value +"|");
            }
            System.out.println();
        }
    }
    }

