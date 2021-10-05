package project16_leapYear;

import java.util.Scanner;

public class LeapYearCal {
    public static void main(String[] args) {
        System.out.println("Artık yıl hesaplayan programa hoşgeldiniz :\n yılları girerek artık olup olmadığını hesaplayabilirsiniz...");
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();
        String leapYear=" ";
        if(year%100==0){
            if(year%400==0){
                leapYear="Artık yıldır !";
            }
            else{
                leapYear="Artık yıl değildir!";
            }
        }
        else if(year%4==0){
            leapYear="Artık yıldır !";
        }
        else{
            leapYear="Artık yıl değildir!";
        }
        System.out.println(year + " bir " +leapYear);
    }
}
