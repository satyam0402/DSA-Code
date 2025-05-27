package DSA.Array.Lecture;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // 1) Hard-code an array so we can see the swap immediately
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Before swap: " + Arrays.toString(arr));  
        
        // 2) Swap indices 0 and 3
        swap(arr, 0, 3);
        
        // 3) Print the array contents after swapping
        System.out.println("After swap:  " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
