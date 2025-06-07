package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class CountStepToZero {

    public static void main(String[] args) {
        int n = 14;
        int steps = countSteps(n);
        System.out.println("Number of steps to reduce " + n + " to zero: " + steps);
    }

    static int countSteps(int n) {
       int c = 0;
       return helper( n, c);
    
}

private static int helper(int n, int c) {
    if (n == 0) {
        return c;
    }
    if (n % 2 == 0) {
        return helper(n / 2, c + 1);
    } else {
        return helper(n - 1, c + 1);
    }
}
}
