public class LeetCodeDice{
    public static void main(String[] args) {
        DiceRoll("",4);

    }
     static void DiceRoll(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;

        }
        for (int i = 1; i <=6 && i<= target; i++){
            DiceRoll(p + i, target-i);
        }

     }
}
