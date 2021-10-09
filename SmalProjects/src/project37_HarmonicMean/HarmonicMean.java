package project37_HarmonicMean;

import java.util.Random;
import java.util.Scanner;

import java.util.Arrays;

public class HarmonicMean {


    public static void main(String[] args) {
        
        
        int [] numbers= new int[8];
        Random r = new Random();
        int sum = 0;
        int average ;



        for (int i=0; i< numbers.length;i++){
            numbers[i]=r.nextInt(100);
            sum+= numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        average=sum/numbers.length;
        System.out.println("girilen sayıların ortalaması: "+average);
    }
}
