package Top_Tech_Inteview;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Automation World";
        str = str.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            count++;
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("Total Count: "+ count +", Vowels Count: "+ vowel + ", Consonants Count: "+consonant);
    }
}
