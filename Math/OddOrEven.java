package DSA.Math;

public class OddOrEven {
    public static void main (String[] args) {
        int n = 68;
        System.out.println("The number " + n + " is " + (isOdd(n) ? "Odd" : "Even"));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1; // Using bitwise AND to check if the least significant bit is set
    }
    
}
