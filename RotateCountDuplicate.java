import java.util.Scanner;
public class RotateCountDuplicate {
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
        int Pivot = findPivotDuplicateElements(nums);
        return Pivot+1;
    }
    // If Array is Duplicate
    static int findPivotDuplicateElements(int[] nums){
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
            // If elements at start, middle and end are equal then skip the duplicates
            if( nums[mid] == nums[start] && nums[mid] == nums[end]){
                // Skip duplicates
                // Note: What if Start or End is Pivot ??
                //Start is Pivot :
                if(nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // End is Pivot :
                if(nums[end] < nums[end -1]){
                    return end - 1;
                }
                end--;
            }
            // Left is sorted, Check in ride side.
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}

