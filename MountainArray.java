import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements : ");

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.print(" Enter Target Element : ");
        int target = in.nextInt();

        int ans = peakIndexInMountainArray(arr, target);
        System.out.print("Target is : " + ans);

    }
    static int peakIndexInMountainArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            int mid = start + ( end - start) / 2;

            if ( arr[mid] > arr[mid + 1]){
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
