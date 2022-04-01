// Link: https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++)
            sum+=nums[i];
        int leftS = 0, rightS=sum-nums[0],i=0;
        if(nums.length==1) return 0;
        for( i=1; i<nums.length; i++)    
        {
            if(leftS == rightS)
                return i-1; 
            else
            {
                leftS+=nums[i-1];
                rightS-=nums[i];
            }
        }
        if(leftS == rightS)
                return i-1; 
        
        return -1;
        
    }
}
