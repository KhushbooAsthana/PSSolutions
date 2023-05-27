package ContainsDuplicate;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean flag = false;
        Map<Integer,Integer> list1 = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(list1.containsKey(nums[i])){
                flag = true;
                break;
            }
            else {
                list1.put(nums[i],1);
            }
        }
        return flag;
    }
}
