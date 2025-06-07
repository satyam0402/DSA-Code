package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class CountZeros {
    public static void main(String[] args) {

        int n = 1002003;
        int count = countZeros(n);
        System.out.println("Number of zeros in " + n + " is: " + count);
    }
    static int countZeros(int n) {
        int c = 0;
        return helper(n, c);
    }
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            c++;
        }
        return helper(n / 10, c);
    }
    
}
