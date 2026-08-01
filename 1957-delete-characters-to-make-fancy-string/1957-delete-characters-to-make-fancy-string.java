class Solution {
    public String makeFancyString(String s) {

        StringBuilder st=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.length()>=2&& st.charAt(st.length()-1)==ch&&st.charAt(st.length()-2)==ch ) continue;
            else{
                st.append(ch);
            }
        }
        return st.toString();

        
    }
}