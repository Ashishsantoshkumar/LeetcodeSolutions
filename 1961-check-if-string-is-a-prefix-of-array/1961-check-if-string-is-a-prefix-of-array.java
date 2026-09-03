class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String prefix="";
        for(int i=0;i<words.length;i++){
            prefix+=words[i];
            if(prefix.equals(s)){
                return true;
            }
            if(prefix.length()>s.length()) return false;
        }
        return false;
        
    }
}