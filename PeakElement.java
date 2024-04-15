import java.util.Scanner;
//https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the array elements : ");

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = in.nextInt();
        }

        System.out.print(" Enter Target Element : ");
        int target = in.nextInt();

        int ans = peakElement(nums, target);
        System.out.print("Target is : " + ans);

    }
    static int peakElement(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {

            int mid = start + ( end - start) / 2;

            if ( nums[mid] > nums[mid + 1]){
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
