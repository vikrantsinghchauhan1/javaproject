package com.vikrant.loop;
import java.util.Scanner;


public class Factorial {
    static void main(String[] args) {
       // 5!=5*4*3*2*1
       // Without recursion
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the number which you want factorial : ");
      int fact=in.nextInt();
      int result=1;
      if(fact==0){
          System.out.println(result);
      }
      for(int i=1;i<=fact;i++){
         result=result*i;
      }
        System.out.println("Factorial of the number :" +fact+" is "+result);
        System.out.println(fact(5));
  }
    //Using recursion
    public static int fact(int number){
        int result=0;
        if(number<=1){
            return 1;
        }     //5!=5*4!;
        return number*fact(number-1);
    }
}
