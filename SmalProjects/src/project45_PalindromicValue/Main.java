package project45_PalindromicValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrome value finder");
        Scanner scan=new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word=scan.nextLine();
        System.out.println(isPalindrome(word));


    }
    static boolean isPalindrome(String str){
        String reverse="";
        for(int i=0;i<str.length();i++){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        else {
            return false;
        }
    }
}
