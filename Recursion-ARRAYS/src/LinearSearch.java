import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the Array Elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter Target Element ");
        int target = in.nextInt();
        System.out.print(LSearch(arr,target,0));
    }
    static int LSearch(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else {
            return LSearch(arr,target,i+1);
        }
    }

//    static boolean LSearch(int[] arr, int target, int i) {
//        if(i == arr.length){
//            return false;
//        }
//        return arr[i] == target || LSearch(arr,target,i+1);
//    }
}
