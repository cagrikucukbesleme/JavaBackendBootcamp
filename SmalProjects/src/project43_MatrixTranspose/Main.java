package project43_MatrixTranspose;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("transpose matrix");
        int [][] list={{1,2,3,4},
                {3,4,5,2},
                {6,7,8,1},
        };


        int row= list.length;
        int col=list[0].length;
        int[][] newList= new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                newList[i][j]=list[j][i];
            }

        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(newList[i][j]+" ");
            }
            System.out.println();
        }

    }
}
