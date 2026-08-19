class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,Integer>ans=new HashMap<>();

        Map<String,Integer>num=new HashMap<>();

        String[] st=s.split(" ");
        if(pattern.length()!=st.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String x=st[i];
            if(!ans.containsKey(ch)){
                ans.put(ch,i);
            }
            if(!num.containsKey(x)){
                num.put(x,i);
            }
            if(!ans.get(ch).equals(num.get(x))){
                return false;
            }
        }
        return true;
        
    }
}