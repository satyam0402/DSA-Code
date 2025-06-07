package DSA.Algorithms.IntroToRecursion;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int ans = fibo(n);
        System.out.println("Fibonacci of " + n + " is: " + ans);
    }
    static int fibo(int n) { 
        if ( n < 2) {
            return n; // Base case: if n is 0 or 1, return n

        }
        return fibo(n-1) + fibo(n-2); // Recursive case: sum of the two previous Fibonacci numbers  

    }
    
}

// Fibonacci numbers are the example of LINEAR RECURENCE RELATION.
// n = 50 it is taking time coz its linear recurrence relation. For n = 50 there will be lot of repeated calls so we have to solve that using Dynamic Programming.
