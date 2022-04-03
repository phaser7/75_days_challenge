// Link: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0,count=0;
        candidate = nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(count<=0) candidate = nums[i];
            
            if(candidate == nums[i])
                count++;
            else
                count--;
        }
        return candidate;
    }
}
