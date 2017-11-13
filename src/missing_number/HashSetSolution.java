package missing_number;

import java.util.HashSet;
import java.util.Set;

public class HashSetSolution {
    public int missingNumber(int[] nums){
        Set<Integer> numSet = new HashSet<Integer>();
        for (int x : nums) {
            numSet.add(x);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
