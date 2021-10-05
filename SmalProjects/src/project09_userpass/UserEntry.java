package project9_userpass;

import java.util.Scanner;

public class UserEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        String userName = input.nextLine();
        System.out.print("Şifre giriniz: ");
        String password= input.nextLine();
        String newPassword;
        if(userName.equals("patika") && password.equals("dev")){
            System.out.println("başarılı bir şekilde giriş yaptınız");
            
        }
        else if(!userName.equals("patika") && password.equals("dev"))
            System.out.println("kullanıcı adınız yanlış");
        else if(userName.equals("patika") && !password.equals("dev")){
            System.out.println("Girmiş olduğunuz şifre yanlış!");
            System.out.println("Şifrenizi sıfırlamak istermisiniz");
            System.out.println("1.evet şifre sıfırla\n2.hayır sıfırlama");
            System.out.print("cevabınız: ");
            int sifre=input.nextInt();
            switch(sifre){
                case 1:
                    System.out.println("Girdiğiniz şifre hatalı girdiğiniz yada unutmuş olduğunuz şifre olmamamsı gerekmektedir....");
                    System.out.print("lütfen yeni şifrenizi giriniz: ");
                    Scanner ina = new Scanner(System.in);
                    newPassword= ina.nextLine();
                    if(newPassword.equals(password) || newPassword.equals("dev")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre başarılı bir şekilde oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("işleminiz iptal ediliyor....");
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptıınız işleminiz iptal ediliyor");


            }
        }
        else  {
            System.out.println("Girmiş olduğunuz bilgiler yanlış");
        }
    }
}
