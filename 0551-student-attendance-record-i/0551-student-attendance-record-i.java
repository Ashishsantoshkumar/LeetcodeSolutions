class Solution {
    public boolean checkRecord(String s) {
        int countA=0,countL=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                countA++;
            }
            if( i+2<s.length() && ch=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                return false;
            }
        }
        if(countA>=2){
            return false;
        }
        return true;
        
    }
}