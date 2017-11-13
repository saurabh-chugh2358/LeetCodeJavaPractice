package missing_number;

public class GaussSolution {
    public int missingNumber(int[] nums) {
        // Sum of the first n numbers = [n(n+1)]/2
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;

        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
