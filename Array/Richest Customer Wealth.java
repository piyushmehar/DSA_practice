// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
// Example 1:
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.


class Solution {
    public int maximumWealth(int[][] arr) {

        int [] m = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max =0;
            for(int j=0;j<arr[i].length;j++){
                max = max + arr[i][j];
            }
            m[i]= max;
        }
        int maxx = m[0];
        for(int i=0;i<arr.length;i++){
            if(m[i]>maxx){
                maxx = m[i];
            }
        }
        return maxx;
    }
}