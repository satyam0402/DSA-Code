public class BS {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        System.out.print(search(arr,66,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s) / 2;
        if(arr[m]==target){
            return m;
        }
        if(target>arr[m]){
            return search(arr,target,m+1,e);
        }
        return search(arr, target, s,m-1);
    }
}
