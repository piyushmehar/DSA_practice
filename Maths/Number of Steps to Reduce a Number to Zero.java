// Input: num = 14
// Output: 6
// Explanation: 
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.

class Solution {
    public int numberOfSteps(int n) {
        int c =0;
        // int x;
        while(n>0){
            if(n%2 !=0 ){
                n = n-1;
                c++;
            }
            n=n/2; 
            c++;
            if(n%2!=0){
                n=n-1;
                c++;
            }
        }
        return c;
    }
}
