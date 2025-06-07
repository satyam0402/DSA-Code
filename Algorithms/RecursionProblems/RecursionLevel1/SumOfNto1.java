package DSA.Algorithms.RecursionProblems.RecursionLevel1;

public class SumOfNto1 {
    public static void main(String[] args) {
        int ans = sumNto1(5);
        System.out.println("Sum of numbers from N to 1 is: " + ans);

    }

    static int sumNto1(int n){
        if(n <= 1) {
            return 1; // Base case: when n is 0, the sum is 0
        }
        return n + sumNto1(n-1);
    }
    
}
