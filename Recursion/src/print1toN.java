import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N :  ");
        int n = in.nextInt();
        int ans = funRev(n);
    }

    static int funRev(int n) {
        if (n == 0) {
            return n;
        }

        funRev(n-1);
        System.out.println(n);

        return n;
    }
}