package project18_findOddNum;

import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        System.out.println("iki porblemden ilki negatif değer girilene kadar çalışcak program{bu değerlerden tek sayıl olanları toplanacaktır.");

        Scanner input=new Scanner(System.in);
        int sayi=0;
        int toplam = 0;
        do{
            System.out.print("Sayı giriniz :");
            sayi=input.nextInt();
            if(sayi%2==1){
                toplam+=sayi;
            }
        }while(sayi>=0);
        System.out.println("girilen sayıların arasında ki tek sayıların toplamı : "+toplam);
        System.out.println("---------------");
        sayi=0;
        toplam=0;
        System.out.println("Tek sayı girilene kadar çalışan ve 4 ün katlarını toplayan program:");

        while (sayi%2==0){
            System.out.print("Sayı giriniz :");
            sayi=input.nextInt();
            if (sayi%4==0){
                toplam+=sayi;
            }
        }
        System.out.println("girilen sayılardan 4 ün katları olan sayıların toplamı: "+toplam);



    }
}
