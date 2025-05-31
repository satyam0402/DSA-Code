package DSA.Algorithms.IntroToRecursion;

public class RecursionMessageProgram {
    public static void main(String[] args) {
        message();
    }
    // Function to print a message recursively
    static void message(){
        System.out.println("Hello, this is a recursive message!");
        message1();
    }
    static void message1() {
        System.out.println("This is another recursive message!");
        message2();
    }
    static void message2() {
        System.out.println("Recursion is fun!");
        message3();
    }
    static void message3() {
        System.out.println("Keep learning and coding!");
        
    }
    
}

// This program demonstrates a simple recursive function that prints messages.
