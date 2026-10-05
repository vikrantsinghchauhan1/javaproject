package com.vikrant.loop;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        int result =0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number which you want to sum of the number : ");
        int num= in.nextInt();
        if (num==0){
            System.out.println(0);
        }

        for (int i=0;i<=num;i++){
                 result+=i;
        }
        System.out.println("Total sum of the number is : "+result);
    }
}
