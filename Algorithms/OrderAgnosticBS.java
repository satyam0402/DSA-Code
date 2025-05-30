package DSA.Algorithms;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 70;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println("Target " + target + " found at index: " + ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isDescending = arr[start] > arr[end];

        while(start <=end) {
            int mid = start + (end-start) / 2;

            if(arr[mid] == target) {
                return mid; // Target found at index mid
            }

            if(isDescending) {
                if( target > arr[mid]) {
                    end = mid-1; // Target is in the left half
                }
                else if (target < arr[mid]) {
                    start = mid + 1; // Target is in the right half
                }
            }
            else {
                if( target < arr[mid]) {
                    end = mid-1; // Target is in the left half
                }
                else if (target > arr[mid]) {
                    start = mid + 1; // Target is in the right half
            }
        
            }
        }
        return -1; // Target not found in the array
    }
    
}
