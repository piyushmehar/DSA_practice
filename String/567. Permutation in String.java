class Solution {
    public boolean checkInclusion(String s1, String s2) {
     char[] ss1 = s1.toCharArray();
     Arrays.sort(ss1);
     String str1 = new String(ss1);
     for(int i =0 ; i<s2.length() - s1.length()+1;i++){
         String temp = s2.substring(i,i+s1.length());
         char[] arr = temp.toCharArray();
         Arrays.sort(arr);
         temp = new String(arr);
         if(temp.equals(str1)){
             return true;
         }
     }
     return false;
        
    }
}
