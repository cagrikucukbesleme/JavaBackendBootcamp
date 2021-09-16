package project8_calculator;

import java.util.Scanner;

public class Calcultr {
    public static void main(String[] args) {
        System.out.println("Hesap Makinası....");
        Scanner input= new Scanner(System.in);
        int a,b;
        System.out.print("ilk sayıyı giriniz :");
        a=input.nextInt();

        System.out.print("ikinci sayıyı giriniz : ");
        b=input.nextInt();


        System.out.println("1.toplama \n2.çıkarma \n 3.çarpma\n4.bölme\n5.üst alma\n6.karekök alma");
        System.out.print("yapmak istediğin işlem nedir :");
        int durum;
        durum=input.nextInt();
        switch (durum){
            case 1:
                System.out.println("Sonuç :"+(a+b));
                break;
            case 2:
                System.out.println("Sonuç :"+(a-b));
                break;
            case 3:
                System.out.println("Sonuç :"+(a*b));
                break;
            case 4:
                System.out.println("Sonuç :"+(a/b));
                break;
            case 5:
                System.out.println("Sonuç :"+Math.pow(a,b));
                break;
            case 6:
                System.out.println("Sonuç a="+a+" karekökü: "+Math.sqrt(a));
                System.out.println("Sonuç b="+b+" karekökü: "+Math.sqrt(b));
                break;
            default:
                System.out.println("geçersiz bir işlem denediniz....");
                break;

        }


    }
}
