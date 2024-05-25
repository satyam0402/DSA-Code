import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of Array : ");

        int size = in.nextInt();

        System.out.print("Enter the elements of Array : ");

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }
        bubbleSort(arr);
        System.out.print("Sorted Array : " + Arrays.toString(arr));

    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        //run for n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each value of i the max element in the array will come at the last respective index.
            for (int j = 1; j <= arr.length - i - 1; j++) {
                // swap if the current element is less then the previous element.
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

}
