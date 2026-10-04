class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] ans=new int[num_people];
        int count=1;
        int i=0;
        while(candies>0){
            if(candies>=count){
                ans[i]+=count;
                candies-=count;
            }
            else{
                ans[i]+=candies;
                candies=0;
            }
            count++;
            i++;
            if(i==num_people){
                i=0;
            }
        }
        return ans;
        
    }
}