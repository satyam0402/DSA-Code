import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ (Google)
public class FindAllMissingNum {
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
        findDisappearedNumbers(nums);
        System.out.print("Sorted Array : " + Arrays.toString(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correctElement = nums[i] - 1;
            if (nums[i] != nums[correctElement]) {
                swap(nums, i, correctElement);
            } else {
                i++;
            }
        }

        //Finding missing numbers.
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        //case 2
        return ans;
    }

    static void swap(int[] nums, int firstElement, int secondElement){
        int temp = nums[firstElement];
        nums[firstElement] = nums[secondElement];
        nums[secondElement] = temp;
    }
    }




