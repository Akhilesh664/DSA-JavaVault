package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {

    public static int findSecondLargest(ArrayList<Integer> list){
        if(list.size() < 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        for(int num : list){
            if (num > max){
                secMax = max;
                max = num;
            } else if (num > secMax && num < max) {
                secMax = num;
            }
        }
        return secMax;
    }


    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99, 99));

        System.out.println("Second Largest: "+findSecondLargest(List));
    }
}
