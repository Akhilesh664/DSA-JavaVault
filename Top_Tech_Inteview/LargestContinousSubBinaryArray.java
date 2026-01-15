package Top_Tech_Inteview;

public class LargestContinousSubBinaryArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1};

        int max = 1;     // longest streak length
        int count = 1;   // current streak length

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        System.out.println("Longest continuous binary streak = " + max);
    }
}
