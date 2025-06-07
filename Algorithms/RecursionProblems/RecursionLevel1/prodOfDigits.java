package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class prodOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int result = productOfDigits(n);
        System.out.println("Product of digits in " + n + " is: " + result);
    }

    static int productOfDigits(int n) {
        if (n == 0) {
            return 1; // Base case: product of digits in 0 is defined as 1
        }
        return (n % 10) * productOfDigits(n / 10); // Recursive case: multiply last digit with product of remaining digits.
    }
    
}
