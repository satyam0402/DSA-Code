package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class PassingNumber {
    public static void main(String[] args) {
        passNumber(5);

    }
    static void passNumber(int n) {
        if(n == 0) {
            return; // Base case: when n is 0, stop recursion
        }
        System.out.print(n + " "); // Print the current number
        passNumber(--n); // Recursive call with n decremented by 1
    }
    
}
