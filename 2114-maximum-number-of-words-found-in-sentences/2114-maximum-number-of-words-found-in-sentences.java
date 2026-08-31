class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxNo=-1;
        for(String s:sentences){
            String[] str=s.split(" ");
            maxNo=Math.max(maxNo,str.length);
        }
        return maxNo;
        
    }
}