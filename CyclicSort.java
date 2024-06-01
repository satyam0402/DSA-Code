import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) { // Corrected the condition here
            arr[i] = in.nextInt();
        }
        in.close(); // Closing the scanner
        cyclicSort(arr);

        System.out.print("Sorted Array : " + Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctElement = arr[i] - 1;
            if(arr[i] != arr[correctElement]){
                swap(arr, i, correctElement);
            } else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int firstElement, int secondElement){
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
