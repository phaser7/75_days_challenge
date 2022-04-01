// Link: https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        
        int left = 0, right = nums.length-1, i=nums.length-1;
        
        while(left<=right)
        {
            if(nums[right]*nums[right] > nums[left]*nums[left])
            {
                arr[i] = nums[right]*nums[right];
                right--;
            }
            else
            {
                arr[i] = nums[left]*nums[left];
                left++;
            }
            i--;
        }
        return arr;
    }
}
