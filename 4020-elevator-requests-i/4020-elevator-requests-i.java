class Solution {
    public int elevatorRequests(int n, int[] requests) {

        int sum=requests[0];
        for(int i=1;i<requests.length;i++){
            int x=Math.abs(requests[i]-requests[i-1]);
            sum+=x;
        }
        return sum;
        
    }
}