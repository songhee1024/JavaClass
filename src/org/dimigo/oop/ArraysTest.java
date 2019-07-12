package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울","의왕","시흥","군포"};

        System.out.println(Arrays.toString(src));

        String[] dest = Arrays.copyOf(src,src.length);

        System.out.println(Arrays.toString(dest));

        System.out.println(dest == src);

        //배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색 (정리 후 가능)
        System.out.println(Arrays.binarySearch(dest,"시흥"));
    }
}
