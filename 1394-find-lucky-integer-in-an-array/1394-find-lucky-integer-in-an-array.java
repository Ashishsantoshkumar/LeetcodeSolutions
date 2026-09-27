class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer,Integer>ans=new HashMap<>();
        for(int n:arr){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        int maxNo=-1;
        for(int m:ans.keySet()){
            int val=ans.get(m);
            if(val==m){
                maxNo=Math.max(maxNo,m);
            }
        }
        return maxNo==-1?-1:maxNo;
    }
}