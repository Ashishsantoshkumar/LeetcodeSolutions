class Solution {
    public int minAddToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sb.append(ch);
            }
            else{
                if( sb.length()>0 && sb.charAt(sb.length()-1)=='(' && ch==')'){
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    sb.append(ch);
                }
            }
        }
        return sb.length();
    }
}