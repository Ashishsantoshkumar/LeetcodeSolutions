class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] positive=new int[n/2];
        int []neg=new int [n/2];
        int p=0,x=0;
        
        for(int m:nums){
           if(m>0){
            positive[p++]=m;
           }
           else{
            neg[x++]=m;
           }
        }
        int[]ans=new int[n];
       int y=0,z=0;
        for(int i=0;i<n;i+=2){
            ans[i]=positive[y++];
            ans[i+1]=neg[z++];
        }
return ans;
        
    }
}