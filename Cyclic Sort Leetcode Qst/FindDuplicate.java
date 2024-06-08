import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
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
        findDuplicate(nums);
        System.out.print("Sorted Array : " + Arrays.toString(nums));
    }
    public static void findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctElement = nums[i] - 1;
                if (nums[i] != nums[correctElement]) {
                    swap(nums, i, correctElement);
                } else {
                    return;
                }

            } else {
                i++;
            }
        }
    }


        static void swap(int[] nums, int firstElement, int secondElement){
            int temp = nums[firstElement];
            nums[firstElement] = nums[secondElement];
            nums[secondElement] = temp;
        }

}



