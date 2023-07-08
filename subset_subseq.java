import java.util.ArrayList;

public class subset_subseq {
    public static void main(String[] args) {
        System.out.println(subseqarraylist("","abc"));

   }
    static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subseq(processed+ch,unprocessed.substring(1));
        subseq(processed,unprocessed.substring(1));
    }
    //return in arraylist format
    static ArrayList<String> subseqarraylist(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String> left = subseqarraylist(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = subseqarraylist(processed,unprocessed.substring(1));
    left.addAll(right);
    return left;
    }
}
