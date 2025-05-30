package DSA.Algorithms;

public class BinarySearchAlgorithm {
    public static void main (String[] args) {

        int[] arr = {3, 10, 11, 16, 21, 29, 100, 1000, 9999};
        int target = 9999;
        int ans = binarySearchAlgorithm(arr, target);
        System.out.println("Target " + target + " Found at index : " + ans);

    }

    static int binarySearchAlgorithm(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        

         while(start <= end) {
         int mid = start + ( end - start ) / 2;

            if( target > arr[mid]) {
                start = mid + 1; // target is in the right half
            } else if (target < arr[mid]) {
                end = mid - 1; // target is in the left half
            } else {
                return mid; // target found at index mid
            }
         }
        return -1; // target not found in the array
    
    }
    
}
