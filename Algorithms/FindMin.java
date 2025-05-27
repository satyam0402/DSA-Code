package DSA.Algorithms;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {80, 100, 1, 35, 66, 7, 98};
        int minValue = FindMinValue(arr);
        System.out.println("Minimum Value in the array is: " + minValue);
    }
    
    static int FindMinValue(int[]arr) { 
        int minValue = arr[0]; // Assume first element is the minimum
        for(int i = 0; i < arr.length; i++) { 
            if(arr[i] < minValue) {
                minValue = arr[i]; // Update minValue if a smaller element is found
            } 
        }
        return minValue; // Return the minimum value found in the array

    }
    
}
