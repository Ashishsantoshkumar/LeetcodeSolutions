class Solution {

    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int minNo=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int index=digitSum(nums[i]);
            if(index==i && minNo>i){
                minNo=i;
            }
        }
        return minNo==Integer.MAX_VALUE?-1:minNo;
    }
}