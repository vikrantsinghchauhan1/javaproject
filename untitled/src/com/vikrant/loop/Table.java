package com.vikrant.loop;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for making table : ");
        int multi= in.nextInt();

        int result=1;
        for(int i=1;i<=10;i++){
            result =multi*i;
            System.out.println(multi +"*" +i +"=" +result);
        }
    }
}
