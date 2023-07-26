class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean[] ans = new boolean[n];
        Arrays.fill(ans,true);
        ans[0] = false;
        ans[1] = false;
        for(int i=2;i*i<=n-1;i++){
            for(int j = i*2;j<=n-1;j+=i){
                ans[j] = false;
            }
        }
        int c = 0;
        for(boolean i : ans){
            if(i == true){
                c++;
            }
        }
        return c;
    }
}
