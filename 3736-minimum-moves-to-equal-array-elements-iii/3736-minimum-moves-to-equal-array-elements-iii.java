class Solution {
    public int minMoves(int[] nums) {
        int maxNo=-1;
        for(int n:nums){
            maxNo=Math.max(maxNo,n);
        }
        int count=0;
        for(int x:nums){
            count+=maxNo-x;
        }
        return count;

        
    }
}