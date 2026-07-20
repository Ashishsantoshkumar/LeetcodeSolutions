class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s=new HashSet<>();
        for(String st:emails){
            String [] parts=st.split("@");
            String[] host=parts[0].split("\\+");
            s.add(host[0].replace(".","")+"@"+parts[1]);
        }
        return s.size();
        
    }
}