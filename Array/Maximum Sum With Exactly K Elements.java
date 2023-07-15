
// Example 1:

// Input: nums = [1,2,3,4,5], k = 3
// Output: 18
// Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
// For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
// For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
// For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
// So, we will return 18.
// It can be proven, that 18 is the maximum answer that we can achieve.


class Solution {
    public int maximizeSum(int[] arr, int k) {
        int n = arr.length;
        int max = arr[0];
        int sum = 0;
        for(int j =0;j<k;j++)
        {
            for(int i=0;i<n;i++){
            if(max<=arr[i]){
                max = arr[i];
                arr[i] = arr[i]+1;
            }
        }
            sum = sum+max;
        }
        return sum;
    }
}
