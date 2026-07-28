class Solution {
    public int kthFactor(int n, int k) {
      
        List<Integer> ans= new ArrayList<>();
        int m=n;
        for(int i=1;i<=n;i++){
            if(m%i==0){
                ans.add(i);
            }
        }
        Collections.sort(ans);
       
       if(k>ans.size()){
        return -1;
       }
        return ans.get(k-1);
        
    }
}