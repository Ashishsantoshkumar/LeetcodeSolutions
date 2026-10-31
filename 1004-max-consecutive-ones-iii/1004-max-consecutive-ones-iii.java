class Solution {
    public int longestOnes(int[] nums, int k) {
        int odds=0;
        int left=0;
        int maxLen=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                odds++;
            
            }
            while(odds>k){
                if(nums[left]==0){
                    odds--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1);


        }
        return maxLen;
    }
}