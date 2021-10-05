package project11_weatherAdvice;

import java.util.Scanner;

public class WeatheSuggest {
    public static void main(String[] args) {
        System.out.println("Bugün ne yapapacaksın\n Ne yapmak konsunda karasız mısın? \n Sana bi kaç tavsiye verebilirim");
        System.out.print("Hava kaç derece : ");
        Scanner input = new Scanner(System.in);
        int air=input.nextInt();

        System.out.println("----Sana verebileceğim tavsiyeler---");
        if(air>100){
            System.out.println("Adana da olabilir misin, Muhtemlen olduğun yerde kül oldun bile :) tavsiyeye gerek yok");

        }
        else if(air>25){
            System.out.println("yüzmeye gidebilirsin");
        }
        else if(air>5){
            if(air>15){
                System.out.println("Pikniğe de gidebilirsin kara senin...");
            }
            else if(air>10  && air<15){
                System.out.println("Pikniğe de gidebilirisin  sinemaya da gidebilirsin");
            }
            else {
                System.out.println("sinemaya gidebilirsin");
            }

        }
        else {
            System.out.println("kayağa gidebilirsin");
        }


    }
}
