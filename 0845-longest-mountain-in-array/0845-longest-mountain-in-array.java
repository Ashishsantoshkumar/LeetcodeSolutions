class Solution {
    public int longestMountain(int[] arr) {

        int i=1;
        int count=0;
        int n=arr.length;
        while(i<n-1){
            if(arr[i-1]<arr[i]&& arr[i]>arr[i+1]){
                int st=i,end=i;
                while(st>0 && arr[st]>arr[st-1]){
                    st--;
                }
                while(end<n-1 && arr[end]>arr[end+1]){
                    end++;;
                }

                count=Math.max(count,end-st+1);
                i=end;

            }
            else{
                i++;
            }

            
        }
        return count;
        
    }
}