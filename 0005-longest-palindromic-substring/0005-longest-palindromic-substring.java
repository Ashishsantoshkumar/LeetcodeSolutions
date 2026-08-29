class Solution {
    boolean isPalindrome(String s,int left,int right){
        
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public String longestPalindrome(String s) {
        int maxLen=-1;
        int st=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    int len=j-i+1;
                    if(len>maxLen){
                        maxLen=len;
                        st=i;
                    }
                }
            }
        }
        return s.substring(st,st+maxLen);
    }
}