class Solution {
    public int oddCells(int m, int n, int[][] old) {
        int[][] naya =new int[m][n];
        int x=0;
        for(int i=0;i<old.length;i++){
            // x=0;
            for(int j=0;j<n;j++){
                naya[old[i][0]][j]++;
            }
            for(int j=0;j<m;j++){
                naya[j][old[i][1]]++;
            }
        }
        for(int i =0; i <naya.length;i++){
            for(int j=0;j<naya[i].length;j++){
                if(naya[i][j]%2!=0){
                    x++;
                }
            }
        }
        return x;
    }
}
