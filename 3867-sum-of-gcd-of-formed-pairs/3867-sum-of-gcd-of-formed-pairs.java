class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=-1;
        int []prefix=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefix);
        int i=0,j=prefix.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
        
    }
}