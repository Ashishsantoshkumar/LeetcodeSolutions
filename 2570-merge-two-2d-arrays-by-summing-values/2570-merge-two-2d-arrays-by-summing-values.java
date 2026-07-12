class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        int i=0,j=0;
        int n=nums1.length;
        int m=nums2.length;
        int [][]ans=new int[n+m][2];
        int k=0;
        while(i<n&& j<m){
            if(nums1[i][0]==nums2[j][0]){
                ans[k][0]=nums1[i][0];
                int sum=nums1[i][1]+nums2[j][1];
                ans[k][1]=sum;
                i++;
                j++;
                
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans[k]=nums1[i];
                i++;

            }
            else{
                ans[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        return Arrays.copyOf(ans,k);



    }
}