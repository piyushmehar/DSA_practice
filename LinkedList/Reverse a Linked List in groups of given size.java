// Input: 1->2->3->4->5->6->7->8->NULL, K = 3 
// Output: 3->2->1->6->5->4->8->7->NULL 
// Input: 1->2->3->4->5->6->7->8->NULL, K = 5 
// Output: 5->4->3->2->1->8->7->6->NULL 
//hence, this code is to reverse a given linked list
class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node curr = node;
        Node next = null;
        Node pre = null;
        int c=0;
        while(c < k && curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            c++;
        }
        
        if(next != null){
            node.next = reverse(next , k);
            
        }
        return pre;
    }
}
