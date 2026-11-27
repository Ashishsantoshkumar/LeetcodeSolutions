class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxN=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                
            }
            else{
                
                sum=nums[i];
            }
            maxN=Math.max(maxN,sum);
            
        }
        return maxN;
        
    }
}