7. Reverse Integer

  class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        long sum=0;
        while(n!=0){
            int a = n%10;
            sum = sum*10 + a;
            n = n/10; 
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE ){
            return 0;
        }
        if(x<0){
            sum = sum* -1;
            return (int)sum;
        }
        return (int)sum;
}
}
