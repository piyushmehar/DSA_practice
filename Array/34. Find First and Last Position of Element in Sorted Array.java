class Solution {
    public int[] searchRange(int[] nums, int target) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++ ){
            if(nums[i] == target){
                ll.add(i);
            }
        }
        if(ll.isEmpty()){
            int arr[] = {-1,-1};
            return arr;
        }
        int x = ll.getFirst();
        int y = ll.getLast();
        int arr[] = {x,y};
        return arr;
    }
}
