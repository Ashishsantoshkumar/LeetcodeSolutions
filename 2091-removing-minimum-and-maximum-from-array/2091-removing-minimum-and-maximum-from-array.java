class Solution {
    public int minimumDeletions(int[] nums) {
        int minNo=nums[0];
        int maxNo=nums[0];
        int minIndex=0;
        int maxIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxNo){
                maxNo=nums[i];
                maxIndex=i;
            }
            else if(nums[i]<minNo){
                minNo=nums[i];
                minIndex=i;
            }
        }
        int n=nums.length;

        int leftSide=Math.min(maxIndex,minIndex);
        int rightSide=Math.max(maxIndex,minIndex);

        int leftAns=rightSide+1;
        int rightAns=n-leftSide;

        int bothSide=(leftSide+1)+(n-rightSide);

        return Math.min(leftAns,Math.min(rightAns,bothSide));

    }
} 