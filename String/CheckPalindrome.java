package String;

public class CheckPalindrome {

    public static void main(String[] args) {

        String str = "madam";
        boolean flag = true;

        // two pointer approach
        int i = 0;
        int j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("not palindrome");
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag){
            System.out.println("palindrome");
        }

    }

}
