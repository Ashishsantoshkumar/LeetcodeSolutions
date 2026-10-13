class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int [] ans=new int [n];
        long sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        for(int i=0;i<n/2;i++){
            sum1+=ans[i];
        }
        for(int i=n/2;i<n;i++){
            sum2+=ans[i];
        }
        return sum2-sum1;
    }
}