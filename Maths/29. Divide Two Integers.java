class Solution {
    public int divide(int a, int b) {
        if(a==-2147483648 && b==-1){
            return 2147483647;
        }
        int x = (int) a/b;
        if(x>Integer.MAX_VALUE){
            return (int)Math.pow(2,31)-1;
        }
        if(x<Integer.MIN_VALUE){
            return (int)(Math.pow(2,31)-1)*-1;
        }
        return x;
    }
}
