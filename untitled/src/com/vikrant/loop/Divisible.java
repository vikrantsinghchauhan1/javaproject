package com.vikrant.loop;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        for (int i=1;i<=100;i++){
            if(i%5==0){
                System.out.println("Divisibility of five is : "+i);
            }

        }
    }
}
