import java.util.ArrayList;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
       int[] arr = {2, 3, 1, 4, 4, 5};
       findAllIndex(arr, 4, 0);
       System.out.print(list);

    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i) {
        if(i == arr.length){
            return;

        }
        if(arr[i] == target) {
            list.add(i);

        }
        findAllIndex(arr, target, i + 1);
    }
}
