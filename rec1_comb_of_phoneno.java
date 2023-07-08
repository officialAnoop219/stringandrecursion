public class rec1_comb_of_phoneno {
    public static void main(String[] args) {
        phoneno("", "21");

    }
    static  void  phoneno(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =up.charAt(0)-'0'; //this will convert '2' into 2

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a' + i);
            phoneno(p+ch,up.substring(1));
            
        }
    }
}
