package two_sum;

import java.util.Arrays;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] original = new int[nums.length];
        int[] pos = new int[2];
        int[] digits = new int[2];
        int endPos = nums.length-1;
        int startPos = 0;

        original = nums.clone();
        Arrays.sort(nums);
        while (startPos < endPos) {
            if ((nums[startPos] + nums[endPos]) == target) {
                digits[0] = nums[startPos];
                digits[1] = nums[endPos];
                break;
            } else if ((nums[startPos] + nums[endPos]) < target) {
                startPos++;
            } else if ((nums[startPos] + nums[endPos]) > target) {
                endPos--;
            }
        }

        int j = 0;
        for (int i = 0; i < original.length; i++) {
            if(j<2 && (original[i] == digits[0] || original[i] == digits[1])){
                pos[j] = i;
                j++;
            }
        }

        return pos;
    }
}

