package project25_AtmMachine;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        String userName,password;

        Scanner input= new Scanner(System.in);
        int balance=1000;
        int passTry=3;
        int select;
        int count;
        while(passTry>0){
            System.out.print("Kullanıcı Adınızı giriniz: ");
            userName=input.nextLine();
            System.out.print("Şifrenizi Giriniz :");
            password=input.nextLine();
            if(userName.equals("patika") && password.equals("dev")) {
                System.out.println("Hoşgeldiniz .Başarılı şekilde Giriş yaptınız: ");
                System.out.println("Menü Aşağıdaki gibidir. İşlemler: ");
                do {
                    System.out.println("1-Para Yatırma \n 2-Para Çekme\n 3-Bakiye sorgulama\n4-Para gönderme\n5-Çıkış Yap");
                    System.out.print("Seçiminiz :");
                    select= input.nextInt();
                    

                    switch(select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar :");
                            count=input.nextInt();
                            balance+=count;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz Tutar: ");
                            count=input.nextInt();
                            if(count>balance){
                                System.out.println("Bakiye yetersiz....");
                            }
                            else {
                                balance-=count;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance+" Tl....\n");
                            break;
                        case 4:
                            System.out.print("Para göndermek istediğiniz Hesap: ");
                            int hesap=input.nextInt();
                            System.out.print(" Göndermek istedğiniz miktar :" );
                            count=input.nextInt();
                            if(count>balance){
                                System.out.println("Bakiye yetersiz....");
                            }
                            else {
                                balance-=count;
                            }
                            break;
                        case 5:
                            System.out.println("Çıkış Yapıyosunuz. İyi Günler.");
                            passTry=-1;
                            break;
                        default:
                            break;
                    }
                }while(select!=5);
            }
            else{
                passTry--;
                if(passTry==0){
                    System.out.println("Şifreniz Bloke Olmuştur. En yakın şubeye gidiniz.");
                }
                else{
                    System.out.println("Yanlış şifre girdiniz");
                    System.out.println("Kalan hakkınız :"+passTry);
                }

            }


        }



    }
}
