import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N :  ");
        int n = in.nextInt();
        int ans = fun(n);

    }
    static int fun(int n){
        if(n==0){
            return n;
        }
        System.out.println(n);
        fun(n-1);
        return n;
    }
}
