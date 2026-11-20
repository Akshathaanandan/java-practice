package day01;
import java.util.Arrays;
public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));   // [1, 3, 6, 10]
    }
}