package Top_Tech_Inteview;

public class SortedArrayCheck {

    public static void main(String[] args) {
//        int[] arr = {1,2,4,7,9};
        int[] arr = {1,4,2,10,9};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted: "+isSorted);
    }

}
