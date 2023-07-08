public class skipword {
    public static void main(String[] args) {
        System.out.println(skip("bdapplefg"));

    }
    static String skip(String unprocessed){
        if(unprocessed.isEmpty()){
            return " ";
        }
        if(unprocessed.startsWith("apple")){
            return skip(unprocessed.substring(5));
        }else {
            return unprocessed.charAt(0) + skip(unprocessed.substring(1));
        }

    }
}
