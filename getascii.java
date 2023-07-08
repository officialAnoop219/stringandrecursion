import java.util.ArrayList;

public class getascii {
    public static void main(String[] args) {
       // char ch = 'a';
       // System.out.println(ch+0);
        System.out.println(subseqarraylistascii("","abc"));
    }
    static void subseqascii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subseqascii(processed+ch,unprocessed.substring(1));
        subseqascii(processed,unprocessed.substring(1));
        subseqascii(processed+(ch+0),unprocessed.substring(1));
    }
    static ArrayList<String> subseqarraylistascii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String> first = subseqarraylistascii(processed+ch,unprocessed.substring(1));
        ArrayList<String> second = subseqarraylistascii(processed,unprocessed.substring(1));
       ArrayList<String> third = subseqarraylistascii(processed+(ch+0),unprocessed.substring(1));
        first.addAll(second);
       first.addAll(third);
        return first;
    }
}
