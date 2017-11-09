package two_sum;

import java.util.HashMap;
import java.util.Map;

public class SolutionUsingMap {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(pairs.containsKey(target-nums[i])){
                indices[0] = pairs.get(target-nums[i]);
                indices[1] = i;
                break;
            }
            pairs.put(nums[i], i);
        }
        return indices;
    }
}
