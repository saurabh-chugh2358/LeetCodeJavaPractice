package missing_number;

public class BitManipulationSolution {
//    Because we know that nums contains n numbers and that it is missing exactly one number on the range
//[0 to n-1] [0..n−1], we know that n definitely replaces the missing number in nums.
//    missing=4^(0^0)^(1^1)^(2^3)^(3^4)=(4^4)^(0^0)^(1^1)^(3^3)^2=0^0^0^0^2=2
    public int missingNumber(int[] nums) {
        int missingNumber = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missingNumber ^= i ^ nums[i];
        }

        return missingNumber;
    }
}
