import java.util.Scanner;

public class RBSDuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the array elements : ");

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter the Target element : ");

        int target = in.nextInt();
        int ans = search(nums, target);
        System.out.print("Ans is : " + ans);
    }
    public static int search(int[] nums, int target){
        int Pivot = findPivotDuplicateElements(nums);
        // If you do not find Pivot, means array is not rotated.
        if(Pivot == -1){
            //Do normal BS
            return BSAlgorithm(nums, target, 0, nums.length-1);
        }
        //If Pivot found, 2 asc arrays
        if(nums[Pivot] == target){
            return Pivot;
        }
        //CASE 2 :
        if(target >= nums[0]){
            return BSAlgorithm(nums, target, 0, Pivot-1);
        }
        //CASE 2 :
        else {
            return BSAlgorithm(nums,target, Pivot + 1, nums.length-1);
        }

    }
    static int BSAlgorithm(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if( target == arr[mid]){
                return mid;
            }
            if ( target > arr[mid]){
                start = mid + 1;
            }
            else if ( target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

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
