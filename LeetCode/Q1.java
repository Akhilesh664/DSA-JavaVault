package LeetCode;

public class Q1 {

    public int missingNumber ( int[] nums){
        int n = nums.length;

        int exptdSum = n * (n + 1) / 2;
        int presentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            presentSum += nums[i];
        }
        return exptdSum - presentSum;
    }

    public static void main(String[] args) {

        Q1 q1 = new Q1();
        int[] nums = {1,2,4,5,6,7,8,9,10};
        System.out.println(q1.missingNumber(nums));

    }
}
