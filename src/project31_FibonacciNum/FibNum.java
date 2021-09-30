package project31_FibonacciNum;

import java.util.Scanner;

public class FibNum {
    public static void main(String[] args) {
        System.out.println("Fibonacci series finder");
        Scanner input=new Scanner(System.in);
        System.out.print("how many number in the Series : ");
        int num = input.nextInt();
        int sum=0,a1=0,a2=1;
        System.out.print(a1+" "+a2+" ");

        for(int i=2;i<num;i++){
            sum=a1+a2;
            System.out.print(sum+" ");
            a1=a2;
            a2=sum;
        }


    }
}
