// class Solution {
//     public void rotate(int[] arr, int k) {
//         LinkedList<Integer> ll = new LinkedList<Integer>();
//         for(int i=0;i<arr.length;i++){
//             ll.add(arr[i]);
//         }
//         int x=0;
//         for(int i=0;i<k;i++){
//             x = ll.removeLast();
//             ll.addFirst(x);
//         }
//         for(int i=0;i<ll.size();i++){
//             arr[i]=ll.get(i);
//         }

// }
// }
//time limit exceeded
class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        
    }public static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
