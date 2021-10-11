package project46_MinesweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int mayinSayisi;
    int [][]game=new int[100][100];
    int [][] mayinKonum=new int[100][100];
    Scanner input = new Scanner(System.in);


    public MineSweeper(int[][] dizi) {
        int mayin=(dizi.length* dizi[0].length)/4;
        this.mayinSayisi =mayin;
        this.game=dizi;
        int satir= dizi.length;
        int sutun=dizi[0].length;
        Run(satir,sutun);
        int puan = 0;
        boolean kontrol = true;
        while(kontrol)
        {
            System.out.println("Seçtiniz konumun satır değerini giriniz: ");
            int x = input.nextInt();
            System.out.println("Seçtiniz konumun sutun değerini giriniz: ");
            int y = input.nextInt();
            if(dizi[x][y] == 1)
            {
                kontrol = false;
            }
            else
            {
                puan = puan + 10;
                System.out.println("Hata hayattasın... Devam");
            }
        }
        System.out.println("");
    }




    public static int[][] Run(int satir, int sutun)
    {
        Random rnd = new Random();

        int[][] matris = new int[satir][sutun];
        int i = 0;
        while(i < satir)
        {
            int j = 0;
            while(j < sutun)
            {
                matris[i][j] = rnd.nextInt();
                j = j + 1;
            }
            i = i + 1;
        }
        for(int k = 0; k < satir; k++) {
            for(int l = 0; l < sutun; l++) {
                System.out.println(matris[k][l] + " ");
                System.out.println();
            }
        }
        return matris;
    }



}
