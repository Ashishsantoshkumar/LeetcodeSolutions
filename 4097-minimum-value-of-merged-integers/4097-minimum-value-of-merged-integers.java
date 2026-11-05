class Solution {
    public int merge(int x,int y){
        String s=String.valueOf(x);
        String st=String.valueOf(y);

        String ans=s+st;

        return Integer.parseInt(ans);
    }
    public int minMergedInteger(int[] nums) {
        int minNo=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            int m=merge(nums[i],nums[i+1]);
            minNo=Math.min(minNo,m);
        }
        return minNo;
        
    }
}