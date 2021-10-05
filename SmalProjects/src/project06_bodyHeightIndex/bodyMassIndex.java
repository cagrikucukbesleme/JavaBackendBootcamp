package project6_bodyHeightIndex;

import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        System.out.print("Lütfen boyunuzu giriniz (m): ");
        Scanner scanner= new Scanner(System.in);
        double heig=scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weig=scanner.nextDouble();

        double massIndex= weig/(heig*heig);

        System.out.println("Vücut kitle indeksiniz : "+massIndex );

    }
}
