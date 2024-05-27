
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        System.out.print("Enter the array elements : ");
        int[] arr = new int[size];
        for ( int i = 0; i <= arr.length; i++){
            arr[i] = in.nextInt();
        }
        selection(arr);
        System.out.print(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
        for(int i=0; i<=arr.length; i++){
            int last = arr.length-i-1;
            int maxElement = getMaxElement(arr, 0, last);
            swap(arr, maxElement, last);
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
