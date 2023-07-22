import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Solution solution = new Solution();

        int[] nums = {0, 1, 0, 3, 12};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
                x++;
            }
        }
        x = nums.length - x;
        for(int i =0 ;i<x;i++){
            arr.add(0);
        }
        for(int i =0 ;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
        }
    }
}
