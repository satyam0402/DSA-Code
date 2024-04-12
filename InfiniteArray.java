import java.util.Scanner;
public class InfiniteArray {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter Infinite Array Size : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter Target value : ");
        int target = in.nextInt();
        int ans = ans(arr, target);
        System.out.print("Ans is : " + ans);


    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + ( end - start )/ 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
