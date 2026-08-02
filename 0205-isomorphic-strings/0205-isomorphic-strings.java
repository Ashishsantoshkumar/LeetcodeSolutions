class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Integer> ans=new HashMap<>();
        Map<Character,Integer> num=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!ans.containsKey(s.charAt(i))){
                ans.put(s.charAt(i),i);
            }
             if(!num.containsKey(t.charAt(i))){
                num.put(t.charAt(i),i);
            }
             if(!ans.get(s.charAt(i)).equals(num.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}