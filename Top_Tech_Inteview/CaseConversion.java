package Top_Tech_Inteview;

public class CaseConversion {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder convertedString = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                convertedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)){
                convertedString.append(Character.toUpperCase(ch));
            } else {
                convertedString.append(ch);
            }
        }
        System.out.println("Original: "+str);
        System.out.println("Case Converted: "+convertedString);
    }
}
