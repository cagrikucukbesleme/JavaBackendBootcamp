package project4_taximetreCounter;

import java.util.Scanner;

public class TaxiMeterCounter {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Taksimetre açılış ücreti= "+a+" TL");

        double b;
        System.out.print("Kaç km yol gidildi: ");
        Scanner input= new Scanner(System.in);
        b= input.nextDouble();

        double c= (b*(2.2))+a;
        boolean kosul1= c>=20;
        double d=kosul1 ? c :20;

        System.out.println("Ödenmesi gereken tutar = "+ d);




    }
}
