package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner sc = new Scanner (System.in);
        String word = sc.next ();
        System.out.println("Введите подстроку");
        Scanner sc1 = new Scanner (System.in);
        String str = sc1.next ();
        boolean b1 = word.endsWith(str);
        if (b1 ==true){
            System.out.println("true");
        }
        else {System.out.println("false");}



    }
}