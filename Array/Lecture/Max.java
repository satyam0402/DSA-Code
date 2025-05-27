package DSA.Array.Lecture;

import java.util.Scanner;

public class Max {
    public static void main( String[] args){
        Scanner in = new Scanner( System.in);

        int[] arr = new int[5];

        for( int i = 0; i <  arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array : " + arr);

        int maxVal = max(arr);
        System.out.println("Max Value : " + maxVal);
        

    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for( int i = 0; i < arr.length; i++){
        if(arr[i] > maxVal){
            maxVal = arr[i];
        }
              
    }
            return maxVal;
}
}
