package DSA.Math;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " is " + (isPrime(i)));
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true; // If no divisors found, n is prime
    }

}
