import java.util.Scanner;

public class CeilingNumberAsc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of Array : ");

        int size = in.nextInt();

        System.out.print("Enter the elements of Array : ");

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }

        System.out.print("Enter the Target element : ");

        int target = in.nextInt();

        int ans = ceilingNumber(arr, target);
        System.out.print("Element found at : " + ans);
    }
    // Ceiling Number is the smallest number in the array that is greater or equal to the target.
    static int ceilingNumber(int[] arr, int target) {
        //Condition for the target being greater than the greatest number in the target.

        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start ;
    }
}
