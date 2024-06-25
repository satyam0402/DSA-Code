//https://www.geeksforgeeks.org/print-1-to-n-without-using-loops/?ref=header_search
import java.util.Scanner;

public class printNos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N :  ");
        int n = in.nextInt();
        int ans = printN(n);


    }
    public static int printN(int n){
        int value = n;
        recursion(n,value);
        return value;
    }
    static void recursion(int n, int value){
        if(n<1){
            return;
        }
        int a = value-n+1;
        System.out.print(a + " ");
        recursion(n-1, value);
    }


}
