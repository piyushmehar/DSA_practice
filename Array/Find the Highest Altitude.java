// 1732. Find the Highest Altitude
// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

  
  class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        arr[0]= 0;
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum+ gain[i];
            arr[i+1] = sum;
        }
        int max = arr[0];
        for(int i =0; i<n+1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
