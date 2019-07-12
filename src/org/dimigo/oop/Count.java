package org.dimigo.oop;

public class Count {
    private static int cnt; //0으로 초기화됨

    public Count(){
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }
}

