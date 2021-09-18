package project21_FindExponent;

import java.util.Scanner;

public class FindExponent {
    public static void main(String[] args) {
        System.out.println(" üslü sayı hesaplayan program..");
        Scanner input = new Scanner(System.in);
        System.out.print(" Taban olacak sayı: ");
        int taban=input.nextInt();
        System.out.print("Üst olaack sayı :");
        int ust= input.nextInt();
        int sonuc=0;
        for(int i=0;i<=ust;i++){
            if(i==0){
                sonuc=1;
            }
            else {
                sonuc *= taban;
            }
        }
        System.out.println(taban+ " üzeri "+ust+" = "+sonuc);
    }
}
