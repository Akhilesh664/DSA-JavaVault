package String;

public class RemoveCharacter {

    // way - 1
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'o';
        String result = input.replace(Character.toString(charToRemove), "");
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }


//    // way - 2
//    public static void main(String[] args) {
//        String str = "Hello World";
//        char charToRemove = 'l';
//        String result = "";
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) != charToRemove){
//                result += str.charAt(i);
//            }
//        }
//        System.out.println("New String : "+result);
//    }

}
