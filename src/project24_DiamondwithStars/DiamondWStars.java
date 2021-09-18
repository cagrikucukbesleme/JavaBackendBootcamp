package project24_DiamondwithStars;

import java.util.Scanner;

public class DiamondWStars {
    public static void main(String[] args) {
        System.out.println("* kullnarak baklava dilimine benzer Diamond şekli oluşturacağız");
        System.out.print("Büyüklüğünü belirlemek için bir sayı giriniz:");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        int i=0;


        for(i=0;i<sayi;i++){
            int bosluk=sayi-i;
            int star=i*2+1;
            for(int j=0;j<bosluk;j++){
                System.out.print(" ");
            }
            for(int k=0;k<star;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(i=sayi;i>=0;i--){
            int bosluk=sayi-i;
            int star=i*2+1;
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
