class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\s+");
        String ans ="";
       for(int i =arr.length-1;i>0;i--){
           ans = ans+arr[i]+" ";
       }
       return ans+arr[0];
    }
}
