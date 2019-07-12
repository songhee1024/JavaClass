package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu =0;

        do{
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1.a");
            System.out.println("2.b");
            System.out.println("3.c");
            System.out.println("4.d");
            System.out.println("5.e");
            System.out.print("메뉴 선택 => ");

            menu=sc.nextInt();

            switch(menu){
                case 1:
                    System.out.println("1선택");
                    break;
                case 2:
                    System.out.println("2선택");
                    break;
                case 3:
                    System.out.println("3선택");
                    break;
                case 4:
                    System.out.println("4선택");
                    break;
                case 9:
                    System.out.println("Bye");
                    sc.close();
                    break;
                 default:
                     System.out.println("X");
                     break;
            }
        }while(menu !=9);


    }
}
