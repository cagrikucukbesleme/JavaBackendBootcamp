package project3_hipotenusCalculator;

import java.util.Scanner;

public class HipotenusCalc {
    public static void main(String[] args) {
        System.out.print("Birinci Kenar = ");
        double a,b,c;

        Scanner input = new Scanner(System.in);
        a=input.nextDouble();

        System.out.print("ikinci kenarı giriniz : ");
        b=input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus : "+c);


        System.out.println("Bilgileri girilen üçgenin Alanını hesaplacağız");

        double d,u;
        u=(a+b+c)/2;

        d=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgeinin alanı : "+ d);


    }



}
