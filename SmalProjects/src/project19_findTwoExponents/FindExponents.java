package project19_findTwoExponents;

import java.util.Scanner;

public class FindExponents {
    public static void main(String[] args) {
        System.out.println("ilk olarak 2 nin sonrasında 4 ve 5 in kuvvetlerini bulan program...");

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi=sc.nextInt();
        int sonuc=0;

        for(int i=0;i<=sayi;i++){
            if(i==0){
                sonuc*=2;
                sonuc=1;
            }
            else sonuc *= 2;

            System.out.println("2 üzeri "+ i+"= "+sonuc);
        }
        System.out.println("---------------------------");


        System.out.println(sayi+"'a kadar olan 2'nin katları :");
        for(int j=1;j<=sayi;j*=2){
            System.out.print(j+" ,");
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("4 ve 5 in katları\n 4 veya 5in katları");
        for(int l=1;l<=sayi;l++){
            if(l%4==0 || l%5==0){
                System.out.print(l+" ,");
            }
            if(l%4==0 && l%5==0){
                System.out.println();
                System.out.print(" *"+l+" ,\n");
            }

        }
    }
}
