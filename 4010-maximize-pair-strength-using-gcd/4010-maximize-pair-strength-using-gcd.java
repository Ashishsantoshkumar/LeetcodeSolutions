class Solution {
    public int gcd(int b, int a) {
        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long maxPairStrength(int[] nums) {
       
        long maxNo = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                int num = gcd(nums[j], nums[i]);
                long x = ((long )nums[i] * nums[j]) / ((long) num * num);
                maxNo = Math.max(maxNo, x);
            }

        }
        return maxNo;

    }
}