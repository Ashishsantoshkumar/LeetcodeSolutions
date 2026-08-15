class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int count=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize >boxTypes[i][0]){
                count+=boxTypes[i][0]  * boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                return count+=truckSize*boxTypes[i][1];
            
            }
        }
        return count;
        
    }
}