package String;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        // Test longestCommonPrefix
        String[] prefixInput = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefixfunction(prefixInput));

    }

    public static String longestCommonPrefixfunction(String[] strs) {

        if(strs == null || strs.length ==  0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }

            }
        }
        return prefix;
    }

}
