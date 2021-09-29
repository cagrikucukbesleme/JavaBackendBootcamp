package project27_FindMinMaxVal;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        System.out.println("Min and Max value finder....");
        Scanner input=new Scanner(System.in);
        int x=0;

        int min=0;
        int max=0;
        int i=1;
        while(x<10000){

            System.out.print(i+". sayıyı giriniz: ");
            x=input.nextInt();

            if(x>max){
                max=x;
            }
            else if (x<min){
                min=x;
            }
            i++;
        }
        System.out.println("Maximum value= "+max);
        System.out.println("Minimum value= "+min);
    }
}
