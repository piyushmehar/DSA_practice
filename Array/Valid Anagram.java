// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        boolean ans = Arrays.equals(ss,tt);
        
        if(ans){
            return true;
        }else{
            return false;
        }

    }
}
