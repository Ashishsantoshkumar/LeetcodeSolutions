class Solution {
     public int digitSum(int num){
        int sum=0;
        
        while(num!=0){
            int lastdigit=num%10;
            sum+=lastdigit;
            num/=10;
        }

        return sum;
    }
    public int maximumSum(int[] nums) {
       int maxNo=-1;
       HashMap<Integer,Integer> ans=new HashMap<>();
       for(int n:nums){
        int found=digitSum(n);
        
        if(ans.containsKey(found)){
           int sum=ans.get(found)+n;
            maxNo=Math.max(maxNo,sum);
            ans.put(found,Math.max(ans.get(found),n));
        }
         else {
    ans.put(found, n);
}
        
       }
       return maxNo;
      
    }
}