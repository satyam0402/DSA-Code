package DSA.Array.Lecture;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(10);

        List.add(1);
        List.add(2);
        List.add(3);

        System.out.println(List);

        for ( int i = 0; i < 5; i++){
            List.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
            System.out.println(List.get(i));
        }
        

    }
}
