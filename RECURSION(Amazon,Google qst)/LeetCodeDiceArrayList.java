import java.util.ArrayList;

public class LeetCodeDiceArrayList {
    public static void main(String[] args) {
        System.out.println(DiceRollArrayList("",4));


    }
    static ArrayList<String> DiceRollArrayList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i ++){
            list.addAll(DiceRollArrayList(p+i,target-i));

        }
        return list;
    }
}
