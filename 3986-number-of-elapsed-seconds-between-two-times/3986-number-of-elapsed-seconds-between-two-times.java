class Solution {
    public int DiffSecon(String [] arr){
        int count=0;
        count+=Integer.parseInt(arr[0])*60*60;
        count+=Integer.parseInt(arr[1])*60;
        count+=Integer.parseInt(arr[2]);
        return count;
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        return  DiffSecon(endTime.split(":"))-DiffSecon(startTime.split(":"));
        
    }
}