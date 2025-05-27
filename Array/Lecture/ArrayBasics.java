package DSA.Array.Lecture;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take input
        int twoDarr[][] = new int[3][3];
        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[i].length; j++) {
                twoDarr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        // give input
        // int [][] twoDarr = {
        // {1,2,3},
        // {4,5,6},
        // {7,8,9}

        // };

        for (int row = 0; row < twoDarr.length; row++) {
            for (int col = 0; col < twoDarr[row].length; col++) {
                System.out.print(twoDarr[row][col] + " ");

            }
            System.out.println();
        }

    }
}