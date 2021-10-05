package project28_FindPerfectNum;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println("Perfect number finder....");
        Scanner input = new Scanner(System.in);
        int a =1;
        int b = 0;
        do{
            b=0;
            System.out.print("Sayı giriniz: ");
            a=input.nextInt();
            for(int i=1;i<a;i++){
                if(a%i==0){
                    b+=i;
                    System.out.println(b);

                }
            }

        }while(a!=b);
        System.out.println("Girilen değer bir mükemmel sayıdır: "+a);


    }
}
