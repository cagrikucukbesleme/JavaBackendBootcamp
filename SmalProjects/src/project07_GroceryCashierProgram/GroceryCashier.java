package project7_GroceryCashierProgram;

import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz=  0.95 , patlican = 5.00;
        int ar,el,doma,mu,pat;
        System.out.print("Armut kaç kilo: " );
        Scanner input = new Scanner(System.in);
        ar= input.nextInt();

        System.out.print("Elma kaç kilo : ");
        el=input.nextInt();

        System.out.print("Domates kaç kilo: ");
        doma=input.nextInt();

        System.out.print("Muz kaç kilo: ");
        mu=input.nextInt();

        System.out.print("Patlican kaç kilo : ");
        pat=input.nextInt();

        double toplam= armut*ar+elma*el+domates*doma+muz*mu+patlican*pat;

        System.out.println("Toplam tutar: "+ toplam);

    }
}
