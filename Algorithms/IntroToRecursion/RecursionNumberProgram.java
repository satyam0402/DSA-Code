package DSA.Algorithms.IntroToRecursion;

public class RecursionNumberProgram {
    public static void main ( String[] args) {
        print1(1);
    }
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    // here body of print func changes that is for print5 so this is the change, the check!!
    static void print5(int n) {
        System.out.println(n);
    }
    
}
