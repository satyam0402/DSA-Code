import java.util.ArrayList;

public class ReturnArrayList2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        ArrayList<Integer> ans = allIndex2(arr, 4, 0 );
        System.out.print(ans);

    }
    static ArrayList<Integer> allIndex2(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        //This list will have answer for that function call only
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = allIndex2(arr,target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
