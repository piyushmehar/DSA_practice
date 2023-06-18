// Example 1:
// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.
// Example 2:
// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
// Example 3:
// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

class Solution {
    public int countDigits(int n) {
        int c=0;
        int x=0;
        int y= n; 
        while(n>0){
            x = n%10;
            if(y%x==0){
                c++;
            }
            n = n/10;
        }
        return c;
    }
}
