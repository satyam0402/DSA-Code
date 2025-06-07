package DSA.Algorithms.IntroToRecursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for( int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
    
        System.out.print("Enter the target element to search: ");
        int target = in.nextInt();
        int result = BSUsingRecursion(arr, target, 0, n - 1);
        System.out.println("Element found at index: " + result);

    }
    static int BSUsingRecursion(int[] arr, int target, int start, int end) {

        if(start > end ) { 
            return -1; // Base case: target not found
        }
        int mid = start + ( end - start) / 2;

        if ( arr[mid] == target) {
            return mid; // Target found at index mid
        }
        if(arr[mid] > target) {
            return BSUsingRecursion(arr, target, start, mid - 1); // Search in the left half
        }
        else {
            return BSUsingRecursion(arr, target, mid + 1, end); // Search in the right half
        }



    }


    
}
