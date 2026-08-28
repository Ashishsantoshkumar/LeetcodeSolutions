class Solution {
    public String reversePrefix(String word, char ch) {
        int j=word.indexOf(ch);
        int st=0;
        StringBuilder sb=new StringBuilder();
        for(int i=j;i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=j+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}