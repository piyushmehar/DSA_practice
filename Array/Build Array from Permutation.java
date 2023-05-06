class Solution {
    public int[] buildArray(int[] nums) {
        int x = nums.length;
        int[] arr = new int[x];
        // int x=0, y=0;
        for (int i =0 ; i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
        
        
    }
}
