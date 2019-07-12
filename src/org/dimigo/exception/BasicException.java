package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        uncheckedException(null);
        checkedException();

    }

    //컴파일러가 강제적으로 예외처리를 요구하지 않음
    private static void uncheckedException(String s) {
        try {

            System.out.println(s.length());
            System.out.println(Integer.parseInt("123a"));
        } catch (NullPointerException npe) {
            System.out.println("문자열 X");
            npe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("숫자입력해");
        } catch (Exception e) { //걍 모든 예외 잡음
            System.out.println("예외발생 !");
        }
    }

    //예외처리 무조건 해야함 안 하면 오류
    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str=br.readLine()) != null){
                System.out.println(str);
            }
        }catch(FileNotFoundException fne){
            System.out.println("파일없음");
        }catch(IOException ie){
            System.out.println("파일 읽기오류");
        }
    }
}
