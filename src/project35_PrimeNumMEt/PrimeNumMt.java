package project35_PrimeNumMEt;

import java.util.Scanner;

public class PrimeNumMt {
    static boolean prime(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime number finder with methods .....");
        Scanner input = new Scanner(System.in);
        int a=0;
        while(a!=-1){
            System.out.print("Bir sayı giriniz:  ");
            a=input.nextInt();
            if(prime(a)){
                System.out.println(a+" sayısı Asal Sayıdır" );
            }
            else{
                System.out.println(a+" sayısı asal sayı değildir..");
            }

        }


    }
}
