package Top_Tech_Inteview;

public class ReverseEntireString {

    // 1 Way.
//    public static void main(String[] args) {
//        String str = "maid";
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(rev);
//    }


    // 2 Way.
//    public static void main(String[] args) {
//        String str = "maid";
//        int n = str.length()-1;
//        String rev = "";
//        for (int i = n; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//    }


    // 3 Way.
    public static void main(String[] args) {
        String input = "Java Coding Interview";
        char[] charArray = input.toCharArray();

        String result = "";
        for(int i = charArray.length-1; i >= 0; i--){
            result += charArray[i];
        }
        System.out.println(result);
    }

}
