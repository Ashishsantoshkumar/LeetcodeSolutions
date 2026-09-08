class Solution {
    public String greatestLetter(String s) {
        Set<Character>ans=new HashSet<>();
        for(char ch:s.toCharArray()){
            ans.add(ch);
        }
        String st="";
        for(char ch='Z';ch>='A';ch--){
            if(ans.contains(ch) && ans.contains(Character.toLowerCase(ch))){
                st+=ch;
                break;
            }
        }
        return st;
    }
}