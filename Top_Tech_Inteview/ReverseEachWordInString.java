package Top_Tech_Inteview;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "Java Is Programming h Language";
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String wrd : words){
            String rev = new StringBuilder(wrd).reverse().toString();
            result.append(rev).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
