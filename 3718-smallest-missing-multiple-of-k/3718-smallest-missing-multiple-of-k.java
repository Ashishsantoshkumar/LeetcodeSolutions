class Solution {
    public int missingMultiple(int[] nums, int k) {

       
        int ans = 0;

        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }

        for(int i=1;i<=nums.length+1;i++){
            if(!s.contains(k*i)){
                ans=k*i;
                break;
            }
        }
        return ans;

    }
}