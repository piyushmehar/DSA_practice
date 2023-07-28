class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for(char i : ch ){
            if(i == '('){
                stk.push(')');
            }
            else if(i == '{'){
                stk.push('}');
            }
            else if(i == '['){
                stk.push(']');
            }
            else if(stk.isEmpty() || stk.pop() != i ){
                return false;
            }
        }
        return stk.isEmpty();
    }
}
