import java.util.Scanner;

public class CountAverage {
    public static void main(String[] args) {
        int mat,fizik, kimya, turkce, tarih, muzik;
        Scanner inp= new Scanner(System.in);

        System.out.print(" Matematik notu=");
        mat= inp.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("kimya notunu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("turkce notunu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("tarih notunu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("muzik notunu giriniz: ");
        muzik=inp.nextInt();



        int toplam=(mat+fizik+ kimya+ turkce+ tarih+ muzik);
        double avrg=toplam/6;
        System.out.print("Ortalamanız : "+ avrg );
        boolean k1= avrg>=60;
        //boolean k2= avrg<60;
        //boolean sonuc= k1||k2;
        String str= k1? " Geçtiniz" :" Kaldınız";
        System.out.println(str);



    }
}
