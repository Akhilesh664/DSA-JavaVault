package Top_Tech_Inteview;

public class StringReversal {

    // 1st Way
//    public static String StringReverse(String str){
//        String rev = new StringBuilder(str).reverse().toString();
//        return rev;
//    }

    // 2nd Way
    public static String StringReverse(String str){
        String rev = "";
        char[] chars = str.toCharArray();
        for(int i = chars.length-1; i >= 0; i--){
            rev += chars[i];
        }
        return rev;
    }


    public static void main(String[] args) {
        String str = "automation";
        System.out.println(StringReversal.StringReverse(str));
    }
}
