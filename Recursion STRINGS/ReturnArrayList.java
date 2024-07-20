import java.util.ArrayList;
import java.util.Collections;

public class ReturnArrayList {
    public static void main(String[] args) {
        System.out.println(SubsequenceReturn("", "abc"));


    }
    static ArrayList<String> SubsequenceReturn(String p, String unprocessed ){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = SubsequenceReturn(p + ch, unprocessed.substring(1));
        ArrayList<String> right = SubsequenceReturn(p, unprocessed.substring(1));

        left.addAll(right);
        return left;

    }
}
