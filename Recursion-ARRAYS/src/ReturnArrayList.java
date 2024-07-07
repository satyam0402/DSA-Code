import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        ArrayList<Integer> ans = allIndex(arr, 4, 0,  new ArrayList<>());
        System.out.print(ans);

    }
    static ArrayList<Integer> allIndex(int[] arr, int target, int i, ArrayList<Integer> list){

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return allIndex(arr, target, i+1,list);
    }
}
