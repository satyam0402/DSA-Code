package DSA.Math;

public class XORFindUnique {
    public static void main ( String[] args) {
        int[] arr =  { 2, 3, 3, 4, 2,6,4};
        System.out.println("The unique element is: " + findUnique(arr));
    }
    private static int findUnique(int[] arr) {
        int unique = 0;
       for ( int i = 0; i <= arr.length - 1; i ++) {
        unique = unique ^ arr[i]; // XOR operation
       }
        return unique; // The result will be the unique element
    }
    
}
