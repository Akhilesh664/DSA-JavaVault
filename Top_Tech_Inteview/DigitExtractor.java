package Top_Tech_Inteview;

public class DigitExtractor {

    // 1 Way. [Using Regex or Regular expressions]
//    public static void main(String[] args) {
//        String alphanumeric = "abc123def456ghi789";
//        System.out.println(alphanumeric.replaceAll("[^0-9]",""));
//    }


    // 2 Way. [Using Character.isDigit()]
    public static void main(String[] args) {
        String alphanumeric = "abc123def456ghi789";
        StringBuilder result = new StringBuilder();
        for(char c : alphanumeric.toCharArray()){
            if(Character.isDigit(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
