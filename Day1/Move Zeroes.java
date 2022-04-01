// Link: https://leetcode.com/problems/move-zeroes/


class Solution 
{
    public int lZero(int[] nums, int start) // to find the position of leftmost zero 
    {
        
        for(int i=start+1; i<nums.length; i++)
        {
            if(nums[i]==0)
            return i;
        }
        return -1;   // return -1 if no zero is present
    }
    
    public void moveZeroes(int[] nums) 
    {
        
        int leftZero = lZero(nums, -1);
        if(leftZero == -1)   // if there are no zeroes, then no need to change anything
        {
            //do nothing
        }
        else
        {
            for(int i=leftZero+1; i<nums.length; i++) // i= leftZero becz we only need change elements after leftmost Zero
            {
                if(nums[i]!=0)  //if element is not 0, swap it with leftmost zero
                {
                    int temp = nums[i]; 
                    nums[i] = 0;
                    nums[leftZero] = temp;

                    leftZero = lZero(nums, leftZero);  // again get the updated leftmost zero's position
                }
            }
        } 
    }
}
