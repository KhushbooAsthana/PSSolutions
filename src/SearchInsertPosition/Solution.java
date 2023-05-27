package SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target==0 || nums.length==0 || target < nums[0])
            return 0;
        int index=0;
        int f=0;
        int i=0;
        while(i<nums.length && nums[i]<=target)
        {
            index=i;
            if(nums[i]==target)
            {
                f=1;
                break;
            }
            i++;
        }
        if(i==nums.length || f==0)
            index++;
        return index;

    }
}