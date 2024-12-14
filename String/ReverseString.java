package String;

public class ReverseString {

//  // way - 1
//    public static void main(String[] args) {
//        String input = "hello";
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Reversed String : "+ reversed);
//    }

    // way - 2
    public static void main(String[] args) {
        String input = "hello world";
        char[] charArray = input.toCharArray();

        String result = "";
        for(int i = charArray.length-1; i >= 0; i--){
//            System.out.print(charArray[i]);
            result += charArray[i];
        }
        System.out.println(result); 

    }
}
