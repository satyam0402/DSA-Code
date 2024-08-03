public class StreamOfChar {
    public static void main(String[] args) {
        skipChar("", "baccdah");

    }
    static void skipChar(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            skipChar(processed,unprocessed.substring(1));

        }
        else {
            skipChar(processed + ch, unprocessed.substring(1));
        }
    }
}
