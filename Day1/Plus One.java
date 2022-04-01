// Link: https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        else
        {
            int arr[] = new int[digits.length +1];
            arr[0] = 0;
            for(int i=1; i<arr.length; i++)
                arr[i] = digits[i-1];
            int i = arr.length -1;
            while(arr[i]==9)
            {
                arr[i] = 0;
                i--;
            }
            arr[i]++;
            if(arr[0]==0)
            {
                for(int j=0; j<digits.length; j++)
                    digits[j] = arr[j+1];
                return digits;
            }
            return arr;
        }
    }
}
