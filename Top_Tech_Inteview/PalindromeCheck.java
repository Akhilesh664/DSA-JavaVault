package Top_Tech_Inteview;

public class PalindromeCheck {

    // 1 Way.
//    public static void main(String[] args) {
//        String str = "madsam";
//        String rev = new StringBuilder(str).reverse().toString();
//        if(str.equals(rev)){
//            System.out.println("Yes it's Palindrome");
//        }else{
//            System.out.println("Not a Palindrome");
//        }
//    }

    // 2 Way.
    public static void main(String[] args) {
        String str = "madam";
        boolean flag = true;

        int i = 0;
        int j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a Palindrome");
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag){
            System.out.println("Palindrome");
        }
    }
}
