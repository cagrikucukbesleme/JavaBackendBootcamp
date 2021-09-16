package project10_passTheClass;

import java.util.Scanner;

public class PassClass {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        System.out.println("Notlarınızı girerek sınıfı geçme durumuzunu öğrenebileceğin program");

        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        int toplam=0,i=0;
        if(mat>0 &&mat<100) {
            toplam += mat;
            i++;
        }
        if(fizik>0 &&fizik<100) {
            toplam += fizik;
            i++;
        }
        if(turkce>0 &&turkce<100) {
            toplam += turkce;
            i++;
        }
        if(kimya>0 &&kimya<100) {
            toplam += kimya;
            i++;
        }
        if(muzik>0 &&muzik<100) {
            toplam += muzik;
            i++;
        }
        int avg=toplam/i;
        if(avg>55){
            System.out.println("Sınıfı başarılı şekilde geçtiniz \nortalmanız: "+avg);
        }
        else{
            System.out.println("Sınıfı geçemediniz. Başarısız!! \nortalmanız"+avg);
        }

    }
}
