package project41_ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySrt {
    public static void main(String[] args) {
        System.out.println("Array sıralama progrmaına hoşgeldiniz...");
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak :");
        int n= input.nextInt();
        int [] list = new int[n];
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz: ");
            list[i]=input.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
