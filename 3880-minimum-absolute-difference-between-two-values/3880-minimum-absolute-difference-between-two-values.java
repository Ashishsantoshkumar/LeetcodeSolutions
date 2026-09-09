class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int st=-1;
        int end=-1;
        int dif=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                st=i;
                if(end!=-1){
                    dif=Math.min(dif,Math.abs(end-st));
                }
            }
            else if(nums[i]==2){
                end=i;
                if(st!=-1){
                    dif=Math.min(dif,Math.abs(end-st));
                }
            }
            
        }
        return dif==Integer.MAX_VALUE?-1:dif;
    }
}