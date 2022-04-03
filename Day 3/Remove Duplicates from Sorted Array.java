// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int out = -1, num = -1, count=0;
        boolean flag = false;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]== nums[i])
            {
                nums[i-1] = 200; //just to keep it unique and indentifiable 
                if(flag== false)
                {
                    out = i-1;
                    flag = true;
                }
                count++;  // counting the number of duplicates
            }           
        }
        if(out == -1) return nums.length;   // if no duplicates are there
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!= 200 && i>out)
            {
                int temp = nums[i];
                nums[i] = 200;
                nums[out] = temp;
                out++;
            }
        }
        return nums.length-count;  // returning the total - duplicates i.e, actual unique numbers
        
    }
}
