package project22_findArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong sayı hesaplayan program....");
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int alt=0,basamak=0;
        int temp=sayi;
        int sonuc=1;
        int sonuc2 = 0;
        int sonuc3=0;


        while(temp!=0){
            temp/=10;
            basamak++;
        }
        temp=sayi;
        System.out.println("Verilen sayı : "+ basamak+" basmaklıdır.");
        while(temp!=0){
            alt=temp%10;
            sonuc3+=alt;
            temp/=10;
            for(int a=0;a<basamak;a++){
                sonuc*=alt;
            }
            sonuc2+=sonuc;
            sonuc=1;
        }
        if(sonuc2==sayi){
            System.out.println(sayi+" arsmtrong bir sayıdır.");
        }
        else{
            System.out.println(sayi+" armstrong bir değer değildir.");
        }
        System.out.println(" basamaklar toplamı : "+sonuc3);


    }
}
