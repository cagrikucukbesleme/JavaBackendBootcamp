package project46_MinesweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dizinin özelliklerini giriniz:");
        System.out.print("Satır sayısını giriniz:");
        int satir=in.nextInt();
        System.out.println();
        System.out.print("Sütun sayısını giriniz:");
        int sutun=in.nextInt();
        int [][] dizi= new int[satir][sutun];
        MineSweeper mine=new MineSweeper(dizi);





    }

}
