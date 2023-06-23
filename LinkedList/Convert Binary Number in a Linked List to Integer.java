// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10

class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}

