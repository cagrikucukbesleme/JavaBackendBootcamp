package project33_FunctionalCalc;

import java.util.Scanner;

public class FuncCalc {
    static void plus(){
        Scanner input = new Scanner(System.in);
        int number,result = 0,i=1;
        while(true){
            System.out.print(i++ + ". sayi : ");
            number= input.nextInt();
            if(number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Sayıların toplamı: " + result);

    }
    static void minus(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int count=input.nextInt();
        int num,result = 0;
        for(int i=1;i<=count;i++){
            System.out.print(i+". Sayı :");
            num= input.nextInt();
            if(i==1){
                result+=num;
            }
            result-=num;
        }
        System.out.println("Sonuç :"+result);

    }
    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);

    }
    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);

    }
    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);

    }
    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);

    }
    static void mod(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int num=scan.nextInt();
        System.out.print("Mod almak istediğiniz sayıyı giriniz:  ");
        int mod=scan.nextInt();
        num%=mod;
        System.out.println("Sonuç : " + num);

    }
    static void perimeter(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Diktörgeinin ilk kenarını giriniz :");
        int kenar=scan.nextInt();
        System.out.print("İkinci kenar: ");
        int kenar2=scan.nextInt();
        System.out.println("Alan : "+kenar*kenar2);
        System.out.println("Çevre :"+(2*(kenar+kenar2)));

    }

    public static void main(String[] args) {
        System.out.println("Fonksiyonel hesap makinesine hoşgeldiniz...");

        Scanner input=new Scanner(System.in);
        int select;
        String menu="1- Toplama islemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do{
            System.out.println(menu);
            System.out.print("Listeden yapmak istediğiniz işlemi seçiniz: ");
            select= input.nextInt();
            switch(select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    perimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("yanlış bir değer girdiniz, tekrar deneyiniz....");
            }

        }while(select!=0);
    }
}
