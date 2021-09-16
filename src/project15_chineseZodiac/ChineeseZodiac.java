package project15_chineseZodiac;

import java.util.Scanner;

public class ChineeseZodiac {
    public static void main(String[] args) {
        System.out.println("Çin Zodyağı hesaplayan programa hoşgeldiniz \n sizde hangi burç(hayvan ) olduğunuz öğrenmek istiyor musunuz?");

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz : ");
        int year = input.nextInt();
        int zod=year%12;
        String zodiac=" ";
        switch (zod){
            case 0:
                zodiac="Maymun";
                break;
            case 1:
                zodiac="Horoz";
                break;
            case 2:
                zodiac="Köpek";
                break;
            case 3:
                zodiac="Domuz";
                break;
            case 4:
                zodiac="Fare";
                break;
            case 5:
                zodiac="Öküz";
                break;
            case 6:
                zodiac="Kaplan";
                break;
            case 7:
                zodiac="Tavşan";
                break;
            case 8:
                zodiac="Ejderha";
                break;
            case 9:
                zodiac="Yılan";
                break;
            case 10:
                zodiac="At";
                break;
            case 11:
                zodiac="Koyun";
                break;

        }
        System.out.println(" Çin Zodyağı Burcunuz :"+zodiac);
    }
}
