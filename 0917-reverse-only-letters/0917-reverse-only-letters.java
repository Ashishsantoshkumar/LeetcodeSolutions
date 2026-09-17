class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        sb.reverse();
        StringBuilder ans=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                ans.append(sb.charAt(j));
                j++;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}