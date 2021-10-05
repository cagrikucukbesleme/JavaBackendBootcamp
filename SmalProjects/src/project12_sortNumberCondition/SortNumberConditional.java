package project12_sortNumberCondition;

import java.util.Scanner;

public class SortNumberConditional {
    public static void main(String[] args) {
        System.out.println("sayıları küçükten büyüğe sıralayan programa hoşgeldiniz-\n 3 adet sayı giriniz");
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        int a= input.nextInt();
        System.out.print("ikinci sayı: ");
        int b= input.nextInt();
        System.out.print("üçüncü sayı: ");
        int c= input.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a<b<c  "+a+" "+b+" "+c);
            }
            else{
                System.out.println("a<c<b  "+a+" "+c+" "+b);
            }
        }
        else if((b<a)&&(b<c)){
            if(a<c){
                System.out.println("b<a<c  "+b+" "+a+" "+c);
            }
            else{
                System.out.println("b<c<a  "+b+" "+c+" "+a);
            }
        }
        else{
            if(a<b){
                System.out.println("c<a<b  "+c+" "+a+" "+b);
            }
            else{
                System.out.println("c<b<a  "+c+" "+b+" "+a);
            }
        }



    }
}
