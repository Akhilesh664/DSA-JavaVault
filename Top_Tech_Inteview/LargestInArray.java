package Top_Tech_Inteview;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 15, 3};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Numbers: "+max);
    }
}
