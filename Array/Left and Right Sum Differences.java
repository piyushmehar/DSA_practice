// Example 1:

// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]
// Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
// The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] lsum = new int[n];
        int[] rsum = new int[n];
        rsum[0]=0;
        lsum[n-1]=0;
        int x;
        for(int i=1;i<n;i++){
            x = nums[i-1];
            rsum[i]=rsum[i-1]+x;            
        }
        x=0;
        for(int i=n-1;i>0;i--){
            x = nums[i];
            lsum[i-1]=lsum[i]+x;            
        }
        int[] ans = new int[n];

        for(int i=0 ; i<n;i++){
            ans[i] = Math.abs(lsum[i]-rsum[i]);
        }

        return ans;
    }
}
