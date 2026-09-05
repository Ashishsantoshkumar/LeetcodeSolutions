class Solution {
    public String reverseWords(String s) {
        String [] st=s.split(" ");
        StringBuilder sb=new StringBuilder();
         for (int k = 0; k < st.length; k++) {
            String x = st[k];
            for(int i=x.length()-1;i>=0;i--){
                sb.append(x.charAt(i));
            }
            if(k<st.length-1){
                sb.append(" ");
            }
            
        }
        return sb.toString();
        
    }
}