//merge sort algorithm

class Solution {
    public void conquer(int[]arr , int st,int mid,int en){
        int[] merge = new int[en-st+1];
        int i = st;
        int j = mid+1;
        int x =0;
        while(i<=mid && j<=en){
            if(arr[i]<arr[j]){
                merge[x++] = arr[i++];
            }else{
                merge[x++]=arr[j++];
            }
        }
        while(i<=mid){
            merge[x++] = arr[i++];
        }
        while(j<=en){
            merge[x++]=arr[j++]; 
        }
        for(int a=0, b = st ;a<merge.length;a++ , b++){
            arr[b]=merge[a];
        }
    }
    public void divide(int[] arr , int st, int en){
        if(st>=en){
            return ;
        }
        int mid = st +(en-st) /2;
        divide(arr,st,mid);
        divide(arr,mid+1,en);
        conquer(arr,st,mid,en);
    }

    public int[] sortArray(int[] arr) {
        int n = arr.length;
        divide(arr,0,n-1);
        return arr;
    }
}
