// Link to the problem: https://leetcode.com/problems/two-sum/

// Brute Force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2]; 
        for(int i=0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
                if(nums[i]+nums[j] == target)
                {
                    a[0] = i;
                    a[1] = j;
                }
        }
        return a;
            
    }
}


// Optimized using hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int b = target - nums[i];
            if(hashMap.containsKey(b))
            {
                arr[1] = i;
                arr[0] = hashMap.get(b);
            }
            else
                hashMap.put(nums[i], i);
            
        }
        return arr;
    }
}
