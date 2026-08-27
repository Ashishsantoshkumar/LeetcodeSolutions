class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int minNo=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            minNo=Math.min(minNo,arr[i]-arr[i-1]);
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==minNo){
               List<Integer>ans=new ArrayList<>();
               ans.add(arr[i-1]);
               ans.add(arr[i]);

               result.add(ans); 
            }
        }
        
        return result;
    }
}