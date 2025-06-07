package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class PrintNumber1toN {
    public static void main(String[] args) {
        int n = 10;
        print1toN(n);
    }

    static void print1toN(int n) {

        if(n == 0) {
            return; // Base case: when n is 0, stop recursion
        }
        print1toN(n-1);
        System.out.print(n + " "); // Print the current number after the recursive call
    }

}
