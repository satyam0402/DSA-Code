package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342; // Example number
        int ans = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + ans);

    }
    static int sumOfDigits(int n) {
        if(n == 0){
            return 0; // Base case: when n is 0, the sum of digits is 0
        }
        return (n%10) + sumOfDigits(n/10); // Recursive case: add the last digit to the sum of the remaining digits
    }
    
}
