class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int j=0,k=0;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even.get(j);
                j++;
            }
            else{
                ans[i]=odd.get(k);
                k++;
            }
        }
        return ans;
    }
}