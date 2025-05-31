package DSA.Algorithms.IntroToRecursion;

import java.util.Scanner;

public class PrintNumbersRecursively {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = in.nextInt();
        System.out.print("Enter limit : ");
        int limit = in.nextInt();
        printNumbers(n,limit);
        
    }
    static void printNumbers(int n, int limit ) {
        if(n  > limit) { // Check if n is within the range of 1 to 100
            return; // Base case: if n is 0, stop recursion
    }
    else {
        System.out.println(n); // Print the current number
        printNumbers(n + 1,limit); // Recursive call with n decrement by 1
    }
    return; // Return to the previous call in the recursion stack
    }
    
}
