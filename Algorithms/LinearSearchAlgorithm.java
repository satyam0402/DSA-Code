package DSA.Algorithms;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
    int[] arr = { 20, 13, 11, 1, 5, 7, 90, 100, 8, 0};

    int target  = 0;
    // 1. Linear Search (index of the target element in the array)
    // int ans = LinearSearchTarget(arr, target);
    // System.out.println("Element found at index: " + ans);

    // 2. Linear Search ( True or False if the target element is present in the array)
    // boolean isPresent = LinearSearchBoolean(arr, target);
    // System.out.println("Is the element present in the array? " + isPresent);

    // 3. Linear Search (Return element if present, else return -1)
    int result = LinearSearchReturnElement(arr, target);
    System.out.println("Element found: " + result);


    }
    // 1. Linear Search (index of the target element in the array)
    // static int LinearSearchTarget(int[] arr, int target) { 
    //     // step - 1. Traverse through the array 
    //    // If the array is empty, return -1
    //     if( arr.length == 0) {
    //         return -1; 
    //     }
    //     for ( int index = 0; index < arr.length; index ++) {
    //         // step - 2. Check if the element at the current index is equal to the target
    //         int element = arr[index];
    //         if ( element == target) { 
    //             return index;
    //         }
    //     }
    //     // step - 3. If the target is not found, return -1
    //     return -1;
    // }


    // 2. Linear Search ( True or False if the target element is present in the array)
    // static boolean LinearSearchBoolean(int[] arr, int target) {
    //     if(arr.length == 0 ){
    //         return false;
    //     }
     
    //     for ( int i = 0; i < arr.length; i ++){
    //         int element = arr[i];
    //         if(element == target) {
    //             return true;
    //         }

    //     }
    //     return false;

    // }

    static int LinearSearchReturnElement(int[] arr, int target) {
        if( arr.length == 0) {
            return -1; 
        }
        for ( int i = 0; i < arr.length; i++) { 
            int element = arr[i];
            if( element == target) { 
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }


   



}
    

