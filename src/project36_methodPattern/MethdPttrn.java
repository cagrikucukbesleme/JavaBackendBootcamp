package project36_methodPattern;

import java.util.Scanner;

public class MethdPttrn {

    static void mtdpt(int a){
        int res = a;

        while (a>-0){
            System.out.print(a+ " ");
            a = a-5;

        }
        System.out.print(a+ " ");
        do {
            a+=5;
            System.out.print(a+ " ");
        }while(a<res);
        System.out.println();


    }
    public static void main(String[] args) {
        System.out.println("Methoda göre pattern uygulaması:çıkış için -1");
        int a = 0;
        Scanner input = new Scanner(System.in);
        while(a!=-1){
            System.out.print("Sayı giriniz: ");
            a = input.nextInt();
            mtdpt(a);
        }
    }
}
