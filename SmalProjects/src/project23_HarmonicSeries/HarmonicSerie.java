package project23_HarmonicSeries;

import java.util.Scanner;

public class HarmonicSerie {
    public static void main(String[] args) {
        System.out.println("Harmonik dizileri bulan program...\n n sayılı harmonik dizisini bulacağız");
        System.out.println("formulü = sum(1/n)");
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n=input.nextInt();
        double sum=0.0;
        for(double i=1;i<=n;i++){
            sum +=(1/i);
        }
        System.out.println("N sayısı :"+n+" olan harmonik dizinin sonucu: "+sum);

    }


}
