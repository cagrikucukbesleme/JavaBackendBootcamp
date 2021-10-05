package project34_ExponenNum;

import java.util.Scanner;

public class ExpNum {
    static int expNum(int a, int b){
        int result = 1;
        String z="hatalı değer girdiniz";
        if(b==0){
            return 1;
        }
        else if(b<0){
            result*=1/a;
        }
        else{
            for(int i=0;i<b;i++){
                result *=a;

            }
        }
        return result;


    }
    public static void main(String[] args) {
        System.out.println("Üslü sayı hesaplaayn program----------- çıkmak için tabana 0 yazınız");
        Scanner input = new Scanner(System.in);
        int alt=1,üst;
        while(alt!=0){
            System.out.print("Tabanı giriniz: ");
            alt=input.nextInt();

            System.out.print("Üssü giriniz: ");
            üst=input.nextInt();
            System.out.println("işlemin sonucu : "+expNum(alt,üst));
        }
        System.out.println("Program sonlandı");

    }
}
