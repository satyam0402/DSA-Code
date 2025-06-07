package DSA.Algorithms.IntroToRecursion;

import java.util.Scanner;

public class PrintNumbersRecursively {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = in.nextInt();
        // System.out.print("Enter limit : ");
        // int limit = in.nextInt();
        printNumbers(n);
        
    }
    static void printNumbers(int n ) {
        if ( n == 5 ) {
            System.out.println(n); // Print the current number
            return; // Base case: if n is 5, stop recursion
        }
        // if(n  > limit) { // Check if n is within the range of 1 to 100
        //     return; // Base case: if n is 0, stop recursion
        System.out.println(n); // Print the current number
        printNumbers(n + 1); // Recursive call with n decrement by 1
        System.out.println("Returning from n = " + n); // Print a message when returning from recursion
    // Return to the previous call in the recursion stack
    }
    
}
