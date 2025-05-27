package DSA.Algorithms;

import java.util.Arrays;

public class LinearSearchAlgoString {
    public static void main( String[] args){
        String name = "Satyam";
        char target = 'y';
        System.out.print(LinearSearchAlgoString(name,target));
        System.out.print(Arrays.toString(name.toCharArray()));


    }
    static boolean LinearSearchAlgoString(String str, char target) {
        // Traverse through the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character matches the target
            if (str.charAt(i) == target) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }  

    }
    
