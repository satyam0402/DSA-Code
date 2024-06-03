//https://leetcode.com/problems/missing-number/ (Amazon Qst)
import java.util.Arrays;
import java.util.Scanner;
class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < nums.length; i++) { // Corrected the condition here
            nums[i] = in.nextInt();
        }
        in.close(); // Closing the scanner
        missingNumber(nums);

        System.out.print("Sorted Array : " + Arrays.toString(nums));
    }
   public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctElement = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctElement]) {
                swap(nums, i, correctElement);
            } else {
                i++;
            }
        }
        //search for first missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        //case 2
        return nums.length;
    }

    static void swap(int[] nums, int firstElement, int secondElement){
        int temp = nums[firstElement];
        nums[firstElement] = nums[secondElement];
        nums[secondElement] = temp;
    }
}