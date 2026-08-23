class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {

        int minNo=Integer.MAX_VALUE;
        int ans=-1;
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){

            if(capacity[i]>=itemSize&&capacity[i]<minNo){
                minNo=capacity[i];
                ans=i;
                
            }

          

        }
        return ans;
        
    }
}