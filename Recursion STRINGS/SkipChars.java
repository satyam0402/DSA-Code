public class SkipChars {
    public static void main(String[] args) {
        System.out.println(SkipNumberOfChars("bacappcah"));

    }
    static String SkipNumberOfChars(String unprocessed){
        if(unprocessed.isEmpty()){
            return " ";

        }
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return SkipNumberOfChars(unprocessed.substring(5));
        }
        else {
            return unprocessed.charAt(0) + SkipNumberOfChars(unprocessed.substring(1));
        }
    }
}
