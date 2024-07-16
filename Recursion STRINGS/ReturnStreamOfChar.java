public class ReturnStreamOfChar {
    public static void main(String[] args) {

        System.out.println(skip( "baccdah"));


    }
    static String skip(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            return skip(unprocessed.substring(1));
        }
        else {
            return ch + skip(unprocessed.substring(1));
        }
    }
}
