class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        int maxNo=-1;
        for(int n:position){
            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }

        }
        maxNo=Math.min(even,odd);
        return maxNo;
    }
}