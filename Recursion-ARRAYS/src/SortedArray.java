import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the Array Elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(sorted(arr,0));
    }
    static boolean sorted (int[] arr, int index){
        if  (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index+1);
    }
}
