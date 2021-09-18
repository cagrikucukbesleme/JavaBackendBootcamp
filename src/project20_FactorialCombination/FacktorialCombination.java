package project20_FactorialCombination;

import java.util.Scanner;

public class FacktorialCombination {
    public static void main(String[] args) {
        System.out.println("Faktoriyel ve kombiansyon hesaplayan program....");
        Scanner sc= new Scanner(System.in);
        System.out.print("Foktoriyel hesabı için sayı giriniz :");
        int sayi=sc.nextInt();
        int sonuc=1;
        int sonuc2=1;
        int sonuc3=1;
        double sonuc4=1;

        for(int i=0;i<=sayi;i++){
            if(i==0){
                i=1;
                sonuc*=i;
            }
            else{
                sonuc*=i;
            }
        }
        System.out.println(sayi+" Faktöriyel = "+sonuc);
        System.out.println("---------------------");
        System.out.println("Kombinayon hesabı:");
        System.out.print("2. Sayıyı giriniz : ");
        int sayi2=sc.nextInt();
        System.out.println(sayi+" 'in "+ sayi2+" li kombinasyonun hesaplıyoruz....C(n,r)...C("+sayi+","+sayi2+") :");

        for(int i=0;i<=sayi2;i++){
            if(i==0){
                i=1;
                sonuc2*=i;
            }
            else{
                sonuc2*=i;
            }
        }
        int sayi3=sayi-sayi2;
        for(int i=0;i<=sayi3;i++){
            if(i==0){
                i=1;
                sonuc3*=i;
            }
            else{
                sonuc3*=i;
            }
        }
        sonuc4=sonuc/(sonuc2*sonuc3);
        System.out.println("C(n,r)...C("+sayi+","+sayi2+") :"+sonuc4);
    }
}
