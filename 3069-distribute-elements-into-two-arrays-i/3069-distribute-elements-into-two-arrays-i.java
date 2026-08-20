class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>m=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        m.add(nums[0]);
        ans.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(m.get(m.size()-1)>ans.get(ans.size()-1)){
                m.add(nums[i]);
            }
            else{
                ans.add(nums[i]);
            }
        }
        int []result=new int[nums.length];
        int k=0;
        for(int i=0;i<m.size();i++){
            result[k++]=m.get(i);
        }
        for(int i=0;i<ans.size();i++){
            result[k++]=ans.get(i);
        }
        return result;
    }
}