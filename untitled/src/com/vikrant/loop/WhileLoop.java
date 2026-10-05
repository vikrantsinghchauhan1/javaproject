package com.vikrant.loop;

import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        Scanner in =new  Scanner(System.in);

        System.out.print("Enter the number : ");
        int giveNum= in.nextInt();
        while (giveNum>0){  //while is used when we don't know the size of input
            System.out.println("Kodewala");
            giveNum--;
        }

    }
}
