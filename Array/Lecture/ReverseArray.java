package DSA.Array.Lecture;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array elemnts : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array before reversing : ");
        for( int i = 0; i < arr.length; i ++){
            System.out.println(arr[i] +  " ");
        }
        int start = 0;
        int end = arr.length - 1;
        reverse(arr, start, end);
        System.out.println("\nArray after reversing : ");
        for( int i = 0; i < arr.length; i ++){
            System.out.println(arr[i] +  " ");
        }

    }
    static void reverse(int[] arr , int start, int end ) { 
        while ( start < end) { 
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) { 
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}

