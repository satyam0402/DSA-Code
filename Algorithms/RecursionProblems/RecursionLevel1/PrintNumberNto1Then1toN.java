package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class PrintNumberNto1Then1toN {
    public static void main(String[] args) {
        int n = 5;
        printNto1Then1toN(n);
    }
    static void printNto1Then1toN(int n) {
        if (n == 0) {
            return; // Base case: when n is 0, stop recursion
        }
        System.out.print(n + " "); // Print the current number
        printNto1Then1toN(n - 1); // Recursive call with n-1
        System.out.print(n + " "); // Print the current number again after returning from recursion
    }
    
}
