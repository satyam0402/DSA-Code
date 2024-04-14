//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of Array : ");

        int size = in.nextInt();

        System.out.print("Enter the elements of Array : ");

        char[] arr = new char[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (char) in.nextInt();

        }

        System.out.print("Enter the Target element : ");

        int target = in.nextInt();

        int ans = smallestLetter(arr, (char) target);
        System.out.print("Element found at : " + ans);
    }
    // Ceiling Number is the smallest number in the array that is greater or equal to the target.
    static int smallestLetter(char[] arr, char target) {
        //Condition for the target being greater than the greatest number in the target.


        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
            }

        return arr[start % arr.length];
    }

}
