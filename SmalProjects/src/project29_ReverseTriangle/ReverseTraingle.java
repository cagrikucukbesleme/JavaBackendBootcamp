package project29_ReverseTriangle;

import java.util.Scanner;

public class ReverseTraingle {
    public static void main(String[] args) {
        System.out.println("İnverted triangle with stars *****");
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç basamaklı olacağını giriniz:  ");
        int sayi=input.nextInt();
        int i=0;
        for(i=sayi;i>=0;i--){
            int bosluk=sayi-i;
            int star=i*2-1;
            for(int j=bosluk;j>0;j--){
                System.out.print(" ");
            }
            for(int k=star;k>0;k--){
                System.out.print("*");
            }

            System.out.println(" ");
        }



    }
}
