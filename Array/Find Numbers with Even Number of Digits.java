class Solution {
    public int findNumbers(int[] nums) {
     int count =0;
     String abc;
     int x;
     for(int i=0;i<nums.length;i++){
         x = nums[i] ;
         abc = Integer.toString(x);
         if(abc.length()%2==0){
             count++;
         }
    } 
    return count;
    }
}
