package project32_PalindromeNum;

import java.util.Scanner;

public class PalindromeNum {
    static boolean isPalindrome(int num){
        int temp=num,reverseNum=0,lastNum;
        while(temp!=0){
            lastNum=temp%10;
            reverseNum=(reverseNum*10)+lastNum;
            temp/=10;
        }

        if(num==reverseNum){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=0;
        while(n!=-1){
            System.out.print("Sayı giriniz: ");
            n=input.nextInt();
            System.out.println("Palindrome mu?: "+n+": " +isPalindrome(n));
        }

        System.out.println("Program sonlandır");


    }

}
