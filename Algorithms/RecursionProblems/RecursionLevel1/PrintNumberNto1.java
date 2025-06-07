package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class PrintNumberNto1 {
    public static void main(String[] args) {
        int n  = 5;
        printNto1(n);
    }
    static void printNto1(int n) {
        if (n == 0) {
            return; // Base case: when n is 0, stop recursion
        }
        System.out.print(n + " "); // Print the current number
        printNto1(n - 1); // Recursive call with n-1
    }
    
}
