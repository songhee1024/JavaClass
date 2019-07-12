package org.dimigo.oop;

public class StringTest {

    public static void main(String[] args) {
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(cat1));
    }
    private static void testString(){
        //01234567890123
            String s="abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3)); //begin index
        System.out.println(s.substring(3,6)); //뒤에서 앞에것 뺀 개수로 생각, def
        System.out.println(s.indexOf("C")); // c-->9
        System.out.println(s.charAt(9)); // 9-->c
        System.out.println(s.concat("ABC")); //abcdefgABCDEFGABC
        System.out.println("    ABC     ".trim()); // ABC 띄어쓰기 제거
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('a','A')); //a-->A
        System.out.println(s.startsWith("abc")); //abc로 시작 true false
        System.out.println(s.endsWith("FG")); //FG로 끝

    }
}
