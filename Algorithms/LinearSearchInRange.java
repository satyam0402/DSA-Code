package DSA.Algorithms;

import java.util.Arrays;

public class LinearSearchInRange {

    public static void main(String[] args){
        String name = "Satyam";
        char target = 'a';
       
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.print(SearchInRange(name,target,1,4));

    }
    static int SearchInRange(String str, char target, int start, int end){

        for(int i = start; i < end; i++){
            if(str.charAt(i) == target){
                return i; // Target found at index i

            }

        }
        return -1; // Target not found in the specified range
    }
    
}
