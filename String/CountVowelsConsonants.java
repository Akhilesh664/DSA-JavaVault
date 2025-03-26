package String;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        String input = "hello World";
        int vowels = 0,consonants = 0;

        input = input.toLowerCase();
        for(char c : input.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println(vowels +" "+consonants);

    }
}
