package array_partition_I;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int minSum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            minSum += nums[i];
        }
        return minSum;
    }
}