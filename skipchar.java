public class skipchar {
    public static void main(String[] args) {
        skip("", "baccad");

    }
    static void skip(String processed, String unprocessed){
        // here processed is character which aare checked and
        // unprocessed are character which are not checked yet
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,unprocessed.substring(1));
        }else{
            skip(processed+ch,unprocessed.substring(1));
        }
    }
}
