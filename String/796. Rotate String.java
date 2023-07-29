//796. Rotate String

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }else if(s.equals(goal)){
            return true;
        }
        int n = 0; String a ="";
        while(n<s.length()){
            a = s.substring(n)+s.substring(0,n);
            if(a.equals(goal)){
                return true;
            }
            n++;
        }
        return false;
    }
}
