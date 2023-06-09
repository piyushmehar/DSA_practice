// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
  
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int result[]; 
        int p = 0;
        
        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
            {
                result[p] = nums[i];
                p++;
            } 
                
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 != 0)
            {
                result[p] = nums[i];
                p++;
            } 
        return result;
    }
}
