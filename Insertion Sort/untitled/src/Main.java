import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
