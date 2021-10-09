package project38_FindMinMaxArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dizide ki  min ve max değer bulan program");
        int [] numbers= new int[8];
        Random r = new Random();
        int sum = 0;
        int average ;
        double har;



        for (int i=0; i< numbers.length;i++){
            numbers[i]=r.nextInt(100);

        }
        System.out.println("dizi =" +Arrays.toString(numbers));
        int min= numbers[0];
        int max = numbers[0];
        for (int i:numbers){
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        System.out.println("dizi =" +Arrays.toString(numbers));

        Scanner sc=new Scanner(System.in);


        Arrays.sort(numbers);
        System.out.println("dizi =" +Arrays.toString(numbers));
        System.out.print("Bir sayı giriniz :");
        int num = sc.nextInt();
        int temp=0;
        int min2 = 0,max2=0;

        for (int i:numbers) {

            temp=num-i;
            if (temp>0 ){

                min2=i;
                System.out.println("find min:"+temp+ " "+(num-i)+" "+min2+" "+ i);
                max2=i+1;
            }
            System.out.println(temp);




        }
        System.out.println("Girilen sayıya en yakın küçük sayı :"+ min2 );
        System.out.println("Girilen sayıya en yakın büyük sayı :"+ max2 );



    }
}
