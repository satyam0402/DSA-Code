import java.util.Scanner;
public class RotationCount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the array elements : ");

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int ans = countRotations(nums);
        System.out.print("Number of Rotations = " + ans);
    }
    public static int countRotations(int[] nums){
        int Pivot = findPivot(nums);
        return Pivot+1;
    }
    //If array is Distinct
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            //4 CASES
            //CASE 1 :
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            //CASE 2 :
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            //CASE 3 and CASE 4 :
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

}
