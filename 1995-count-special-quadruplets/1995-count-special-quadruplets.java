class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1;
                while (k < n - 1) {
                    int l = k + 1;
                    while (l < n) {

                        int sum = nums[i] + nums[j] + nums[k];
                        if (sum == nums[l]) {
                            count++;
                        }
                        l++;
                    }
                    k++;
                }
            }
        }
        return count;

    }
}