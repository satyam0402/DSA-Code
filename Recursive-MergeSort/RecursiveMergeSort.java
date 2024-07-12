import java.util.Arrays;

public class RecursiveMergeSort {
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        //pointer i for left
        int i = 0;

        //pointer j for right
        int j = 0;

        //pointer k for new merged array
        int k = 0;

        while ( i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //In case of any one of array did not completely traverse through all elements means the comparison b/w two arrays is finished
        // w.r.t any one array so we just need to add all the remaining elements of the other array as they all are sorted.
        // Any one of the following loops will execute :
        while ( i < first.length){
                mix[k] = first[i];
                i++;
                k++;
            }
        while ( j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

return mix;

    }


}
