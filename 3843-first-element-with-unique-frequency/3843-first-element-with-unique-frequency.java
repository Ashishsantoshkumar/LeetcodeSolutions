class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> ans=new HashMap<>();
        for(int n:nums){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        Map<Integer,Integer> map=new HashMap<>();

        for(int x:ans.values()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int m:nums){
            if(map.get(ans.get(m))==1){
                return m;
            }
        }
        return -1;
    }
}