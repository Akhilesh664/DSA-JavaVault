package Top_Tech_Inteview;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String str = "madam";
        int count = 0;

        for (char ch : str.toCharArray()){
            count++;
        }
        System.out.println("count: " +count);
    }
}
