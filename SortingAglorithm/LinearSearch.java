package SortingAglorithm;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {12,23,21,34,45,50};
        int n = arr.length;
        int t = 55;

        int flag = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == t){
                System.out.println("target is found at index : "+i);
                flag = 1;
                break;
            }
        }

        if (flag == 0){
            System.out.println("target is not found");
        }
    }
}
