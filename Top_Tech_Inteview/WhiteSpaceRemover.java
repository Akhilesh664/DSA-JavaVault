package Top_Tech_Inteview;

public class WhiteSpaceRemover {

    // 1 Way.
//    public static void main(String[] args) {
//        String str = "  Java Programming is Fun. ";
//        System.out.println(str.replaceAll("\\s+", ""));
//    }


    // 2 Way.
    public static void main(String[] args) {
        String str = "  Java Programming is Fun. ";
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!Character.isWhitespace(ch)){
                result.append(ch);
            }
        }
        System.out.println(result);
    }

}
