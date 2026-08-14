class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        while (k > 0) {

            int minNo = Integer.MAX_VALUE;
            int st = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < minNo) {
                    minNo = nums[i];
                    st = i;
                }

            }
            nums[st] = -nums[st];
            k--;

        }
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        return sum;

    }
}