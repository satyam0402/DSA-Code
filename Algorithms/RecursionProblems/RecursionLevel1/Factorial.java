package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println("Factorial is: " + ans);

    }
    static int factorial(int n) {
        if( n <=0){
            return 1; // Base case: factorial of 0 or negative number is defined as 1
        }
        return n * factorial(n-1);  // Recursive case: n! = n * (n-1)!
    }
    
}
