class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int []rows=new int[m];
        int []col=new int[n];
        for(int []a:indices){
            rows[a[0]]++;
            col[a[1]]++;
        }
        int result=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rows[i]+col[j])%2!=0){
                    result++;
                }
            }
        }
        return result;
    }
}