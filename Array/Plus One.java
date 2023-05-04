// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;

        while (i >=0 && digits[i] == 9) {
            i --;
        }
        

        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        

        int[] result = new int[digits.length];
        
        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }
        
        return result;
        
    }
}
