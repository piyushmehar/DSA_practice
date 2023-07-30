class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int c =0;
        for(int i =0;i<n;i++){
            c = c^arr[i];
    }
    return c;
}
}
