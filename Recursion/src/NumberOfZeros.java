import java.util.Scanner;

public class NumberOfZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : " );
        int n = in.nextInt();

        int ans = count(n);
        System.out.print("Number of zeros in " + n + " is " + ans);

    }

    private static int count(int n) {
        return helper(n,0);
    }
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);

        }
    }
    }

