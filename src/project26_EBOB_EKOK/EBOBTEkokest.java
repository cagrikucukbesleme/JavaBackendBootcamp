package project26_EBOB_EKOK;

import java.util.Scanner;

public class EBOBTEkokest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ebob ekok hesaplama Programına hoşgeldiniz:");
        System.out.print("İlk sayıyı griniz: ");
        int a1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int a2=input.nextInt();
        int i=1;
        int abc=1;
        while(i<=a1) {
            if(a1 % i == 0 && a2 % i == 0){
                abc=i;
            }
            i++;

        }

        System.out.println("girilen sayıalrın "+a1+", "+a2+" Ebob'u ="+abc);
        int ekk=(a1*a2)/abc;
        System.out.println("Verilen sayının ekok'u ise: "+ekk);
    }
}
