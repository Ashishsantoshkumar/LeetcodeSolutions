class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            char x=s.charAt(n-i-1);
            if(ch==x){
                return i;
            }
        }
        return -1;
        
    }
}