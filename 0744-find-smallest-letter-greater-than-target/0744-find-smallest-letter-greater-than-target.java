class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int index=target-'a';
        for(char ch:letters){
            int in=ch-'a';
            if(in>index){
                return ch;
            }
        }
        return letters[0];
    }
}