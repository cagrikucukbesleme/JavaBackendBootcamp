package project17_FindevenNum;

import java.util.Scanner;

public class FindEven {

    public static void main(String[] args) {
        System.out.println("Programımız iki varklı aşamadan oluşmaktadır\n 2 farklı döngü kullanılacaktır.");
        System.out.println("Verilen sayıya kadar olan çift sayıları bulan program:");

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("Çift Sayılar:  ");
        for(int i=1;i<sayi1;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }

        }
        int i=0;
        System.out.println();
        System.out.print("3 e ve 4 'e bölünebilen sayı: ");
        while(i<sayi1){
            if(i%3==0 && i%4==0){
                System.out.print(i+" ,");

            }
            i++;

        }
    }






}
