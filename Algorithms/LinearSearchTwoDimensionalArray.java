package DSA.Algorithms;

import java.util.Arrays;

public class LinearSearchTwoDimensionalArray {

    public static void main(String[] args){

        int[][] arr = {
            {23, 31, 5},
            {20,11,36},
            {200,1,2}
        };

        int target = 200;
        int[] ans = LinearSearch2D(arr, target);
        System.out.print(Arrays.toString(ans));

    }
    static int[] LinearSearch2D(int[][] arr, int target) {
        // Traverse through the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Check if the current element matches the target
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // Return the indices of the target
                }
            }
        }
        return new int[]{-1, -1}; // Target not found
    }
    
}
