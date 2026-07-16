class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCase=0;
        int lower=0;
        for(char ch:word.toCharArray()){
            if(ch>=65 && ch<=90){
                upperCase++;
            }
            else if(ch >= 97 && ch <= 122){
                lower++;
            }
        }

        if(upperCase==word.length() || lower==word.length()){
            return true;
        }

        int first=word.charAt(0);
        if(first>=65 && first<=90 && upperCase==1){
            return true;
        }
        return false;
    }
}