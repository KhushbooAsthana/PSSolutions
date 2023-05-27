package TwoSum;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int other = target - nums[i];
            if(cache.containsKey(other)) {
                int x = cache.get(other);
                return new int[] {x, i};
            }
            else {
                cache.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}