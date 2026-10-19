class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:nums){
            if(ans.containsKey(n)){
                count+=ans.get(n);
            }
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        return count;
    }
}